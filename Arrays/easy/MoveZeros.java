// 283. Move Zeroes
// Easy
// Topics
// Companies
// Hint
// Facebook
// Microsoft
// Apple
// Amazon
// Yandex
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

package Arrays.easy;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 1,0 };
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            }
        }
        if (countZero == 0) {
            return;
        }
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[counter] = nums[i];
                counter++;
            }
            if (counter > (nums.length - countZero-1)) {
                while (counter<nums.length) {
                    nums[counter] = 0;
                    counter++;  
                }
            }
        }
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }
    }
}
