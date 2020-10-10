package org.artemy63.javase.examples;

import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

/**
 * Tree map keeps entries sorted according to natural ordering of its keys
 */
public class ExampleOfTreeMap {

    @Test
    public void testTreeMapKeepsOrderingsEntriesNaturally() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");

        assertEquals("[1, 2, 3, 4, 5]", map.keySet().toString());
    }

    @Test
    public void testTreeMapKeepsOrderingsEntriesNaturally2() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("c", "val");
        map.put("b", "val");
        map.put("a", "val");
        map.put("e", "val");
        map.put("d", "val");

        assertEquals("[a, b, c, d, e]", map.keySet().toString());
    }

    @Test
    public void testTreeMapKeepsOrderingsEntriesAccordingComparator() {
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");

        assertEquals("[5, 4, 3, 2, 1]", map.keySet().toString());
    }

    @Test
    public void testTreMapSupportPerformQueries() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");

        Integer highestKey = map.lastKey();
        Integer lowestKey = map.firstKey();
        Set<Integer> keysLessThan3 = map.headMap(3).keySet();
        Set<Integer> keysGreaterThanEqTo3 = map.tailMap(3).keySet();

        assertEquals(Integer.valueOf(5), highestKey);
        assertEquals(Integer.valueOf(1), lowestKey);
        assertEquals("[1, 2]", keysLessThan3.toString());
        assertEquals("[3, 4, 5]", keysGreaterThanEqTo3.toString());
    }

}
