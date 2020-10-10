package org.artemy63.javase.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class ExampleOfConcurrentHashMap {

    @Test
    public void testUsingHashMapWhenSumParallel() throws Exception {
        Map<String, Integer> hashMap = new HashMap<>();

        List<Integer> sumList = parallelSum100(hashMap, 100);

        Assert.assertNotSame(1, sumList
                .stream()
                .distinct()
                .count());
        long wrongResultCount = sumList
                .stream()
                .filter(num -> num != 100)
                .count();

        assertTrue(wrongResultCount > 0);
    }

    @Test
    public void testUsingConcurrentHashMapWhenSumParallel() throws Exception {
        Map<String, Integer> hashMap = new ConcurrentHashMap<>();

        List<Integer> sumList = parallelSum100(hashMap, 100);

        Assert.assertSame(1L, sumList
                .stream()
                .distinct()
                .count());
        long wrongResultCount = sumList
                .stream()
                .filter(num -> num != 100)
                .count();

        assertEquals(0, wrongResultCount);
    }

    //does not allow null as key
    @Test(expected = NullPointerException.class)
    public void testConcurrentHashMapThrowsNPEWhenPutNullKey() {
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put(null, new Object());
    }

    //does not allow null as value
    @Test(expected = NullPointerException.class)
    public void testConcurrentHashMapThrowsNPEWhenPutNullValue() {
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("test", null);
    }

    /**
     * For each map.computeIfPresent action in parallel, HashMap does not provide a consistent view of what should be the present integer value,
     * leading to inconsistent and undesirable results.
     *
     * As for ConcurrentHashMap, we can get a consistent and correct result
     */
    private List<Integer> parallelSum100(Map<String, Integer> map, int executionTimes) throws InterruptedException {
        List<Integer> sumList = new ArrayList<>(1000);
        for (int i = 0; i < executionTimes; i++) {
            map.put("test", 0);
            ExecutorService executorService = Executors.newFixedThreadPool(4);
            for (int j = 0; j < 10; j++) {
                executorService.execute(
                        () -> {
                            for (int k = 0; k < 10; k++)
                                map.computeIfPresent(
                                        "test",
                                        (key, value) -> value + 1
                                );
                });
            }
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
            sumList.add(map.get("test"));
        }
        return sumList;
    }
}
