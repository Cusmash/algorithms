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

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		var target = 9;

		int[] nums2 = { 3, 2, 4 };
		var target2 = 6;

		int[] nums3 = { 3, 3 };
		var target3 = 6;

		System.out.println(Arrays.toString(twoSum(nums, target)));
		System.out.println(Arrays.toString(twoSum(nums2, target2)));
		System.out.println(Arrays.toString(twoSum(nums3, target3)));
		
		System.out.println('\n');
		
		System.out.println(Arrays.toString(twoSum2(nums, target)));
		System.out.println(Arrays.toString(twoSum2(nums2, target2)));
		System.out.println(Arrays.toString(twoSum2(nums3, target3)));
	}

	public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

	/*
 	* for a hashMap in order to save memory, we are gonna have to substract base on the targe, for instance
 	* { 5, 2, 4 } to get 6 we are gonna substract from the target our index value 
 	* so the key will contain the amount of numbers needed to get to the target and the value will be the index in this case we start at index 0 that contains 5 so
 	* 6 - 5 = 1 will be stored as key = 1 (amount of numbers need to add to get the target) and value = 0 (array index)
 	* then we will have to check if the next index value exists in our map if not start over
 	* in case the like on index 2, we look through our map to get the value of that index and add it to our 
 	*   HasMap
 	*   K -> V
 	*   1 -> 0 
 	*   4 -> 1
 	*   {2, 1}
 	*/
	// HashMap
	public static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> dictionary = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer dictionaryIndex = dictionary.get(nums[i]);
            if(dictionaryIndex != null){
                return new int[]{dictionaryIndex, i};
            }
            dictionary.put(target - nums[i], i);
        }
        return nums;
    }
}