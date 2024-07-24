// 88. Merge Sorted Array
// Easy
// Topics
// Companies
// Hint
// Facebook
// Microsoft
// Apple
// Amazon
// LinkedIn
// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
// Example 2:

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].
// Example 3:

// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

package Arrays.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
        // for (int i = 0; i < nums1.length; i++) {
        // System.out.println(nums1[i]);
        // }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        // int[] temp = new int[nums1.length];
        // for (int i = 0; i < nums1.length; i++) {
        //     temp[i] = nums1[i];
        // }
        // int i = 0;
        // int j = 0;
        // int currentIndex = 0;
        // while (currentIndex < nums1.length) {
        //     if (j >= nums2.length) {
        //         nums1[currentIndex] = temp[i++];
        //     }
        //     if (temp[i] > nums2[j]) {
        //         System.out.println(nums2[j++]);
        //         // nums1[currentIndex] = nums2[j++];
        //     }
        //     if (temp[i] < nums2[j]) {
        //         System.out.println(temp[i++]);
        //         // nums1[currentIndex] = temp[i++];
        //     }
        //     if (temp[i] == nums2[j]) {
        //         System.out.println(i+";"+j+";"+currentIndex);
        //         // System.out.println("equal");
        //         System.out.println(temp[i++]);
        //         // nums1[currentIndex] = temp[i++];
        //     }
        //     currentIndex++;
        // }
        // for (int k = 0; k < nums1.length; k++) {
        //     System.out.println(nums1[k]);
        // }
    }

}
