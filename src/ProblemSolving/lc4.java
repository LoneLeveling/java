package ProblemSolving;

import java.util.Arrays;

public class lc4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(getMedian(nums1, nums2));
    }

    public static double getMedian(int[] nums1, int[] nums2) {
        int m = nums1.length + nums2.length;
        double median = 0;
        int[] arr = new int[m];
        int i = 0;
        for (i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            arr[i++] = nums2[j];
        }
        Arrays.sort(arr);
        if (arr.length % 2 == 0)//meaning even array
        {
            return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;

        } else {
            return (double) arr[arr.length / 2];

        }
    }
}