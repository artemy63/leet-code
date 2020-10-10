package org.artemy63.arrays;

import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 * Input:
 * nums1 = [4,5,6,0,0,0], m = 3
 * nums2 = [1,2,3], m = 3
 * Output: [1, 2, 3, 4, 5, 6]
 *
 * Input:
 * nums1 = [-12,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
 * m = 1
 * nums2 = [-49,-45,-42,-41,-40,-39,-39,-39,-38,-36,-34,-34,-33,-33,-32,-31,-29,-28,-26,-26,-24,-21,-20,-20,-18,-16,-16,-14,-11,-7,-6,-5,-4,-4,-3,-3,-2,-2,-1,0,0,0,2,2,6,7,7,8,10,10,13,13,15,15,16,17,17,19,19,20,20,20,21,21,22,22,24,24,25,26,27,29,30,30,30,35,36,36,36,37,39,40,41,42,45,46,46,46,47,48]
 * n = 90
 * Output:
 * [-49,-45,-42,-41,-40,-39,-39,-39,-38,-36,-34,-34,-33,-33,-32,-31,-29,-28,-26,-26,-24,-21,-20,-20,-18,-16,-16,-14,-12,-11,-7,-6,-5,-4,-4,-3,-3,-2,-2,-1,0,0,0,2,2,6,7,7,8,10,10,13,13,15,15,16,17,17,19,19,20,20,20,21,21,22,22,24,24,25,26,27,29,30,30,30,35,36,36,36,37,39,40,41,42,45,46,46,46,47,48]
 */
public class LeetCode3253 {

    public static void main(String[] args) {
        int[] sourceArr1 = {1, 2, 3, 0, 0, 0};
        int[] sourceArr2 = {2, 5, 6};

        merge(sourceArr1, 3, sourceArr2, 3);

        int[] sourceArr11 = {4, 5, 6, 0, 0, 0};
        int[] sourceArr22 = {1, 2, 3};

        merge(sourceArr11, 3, sourceArr22, 3);

        int[] sourceArr13 = {-12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] sourceArr23 = {-49, -45, -42, -41, -40, -39, -39, -39, -38, -36, -34, -34, -33, -33, -32, -31, -29, -28, -26, -26, -24, -21, -20, -20, -18, -16, -16, -14, -11, -7, -6, -5, -4, -4, -3, -3, -2, -2, -1, 0, 0, 0, 2, 2, 6, 7, 7, 8, 10, 10, 13, 13, 15, 15, 16, 17, 17, 19, 19, 20, 20, 20, 21, 21, 22, 22, 24, 24, 25, 26, 27, 29, 30, 30, 30, 35, 36, 36, 36, 37, 39, 40, 41, 42, 45, 46, 46, 46, 47, 48};

        merge(sourceArr13, 1, sourceArr23, 90);
    }

//too long cause it shifted source array each time, another version more faster cause it compares elements from the ends of array
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        System.out.println("source array " + Arrays.toString(nums1));
//
//        int indexBySecondArray = 0;
//        for (int i = 0; i < nums1.length; i++) {
//            int sourceArrElement = nums1[i];
//
//            while (indexBySecondArray < n) {
//                int secondArrElement = nums2[indexBySecondArray];
//                if (secondArrElement < sourceArrElement || (/*secondArrElement > sourceArrElement &&*/ i >= m + indexBySecondArray)) {
//
//                    if (indexBySecondArray > 40 || secondArrElement == -1) {
//                        blablabla++;
//                    }
//                    //shift nums1
//                    for (int k = nums1.length - 1; k > i; k--) {
//                        nums1[k] = nums1[k - 1];
//                    }
//
//                    nums1[i] = secondArrElement;
//                    sourceArrElement = secondArrElement;
//                    indexBySecondArray++;
//                } else {
//                    break;
//                }
//            }
//        }
//
//
//        System.out.println("source array " + Arrays.toString(nums1));
//    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.out.println("source array " + Arrays.toString(nums1));

        int i = m - 1; //last element in source array
        int j = n - 1; //last element in second array
        int k = nums1.length - 1; //place to insert biggest element from both arrays

        //while we have elements in both arrays DO
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                //in case element from second array bigger than element from first array - place it to the end of first array
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }

        //case when we there are unprocessed element in second array
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        System.out.println("source array " + Arrays.toString(nums1));
    }
}
