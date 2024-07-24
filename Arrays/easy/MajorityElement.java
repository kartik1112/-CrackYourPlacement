// 169. Majority Element
// Solved
// Easy
// Topics
// Companies
// Amazon
// Microsoft
// Adobe
// Apple
// Google
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

package Arrays.easy;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,3,4};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        int high = 0;
        int highestCount = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (highestCount == nums[i]) {
                counter++;
            }
            else if (counter>high) {
                high = counter;
                highestCount = nums[i];
            }
        }
        return highestCount;
    }

}
