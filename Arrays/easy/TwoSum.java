// 1. Two Sum
// Solved
// Easy
// Topics
// Companies
// Hint
// Amazon
// Adobe
// Google
// Apple
// Microsoft
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]


package Arrays.easy;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println(arr[i]+arr[j]);
                if (arr[i]+arr[j] == target) {
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return temp;
    }
}
