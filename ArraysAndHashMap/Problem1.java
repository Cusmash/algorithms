package ArraysAndHashMap;
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
		int[] soluliton1 = twoSum(nums, target);
		System.out.println(Arrays.toString(soluliton1));

		int[] nums2 = { 3, 2, 4 };
		var target2 = 6;
		int[] soluliton2 = twoSum(nums2, target2);
		System.out.println(Arrays.toString(soluliton2));

		int[] nums3 = { 3, 3 };
		var target3 = 6;
		int[] soluliton3 = twoSum(nums3, target3);
		System.out.println(Arrays.toString(soluliton3));

		System.out.println('\n');

		int[] hashmap1 = twoSum2(nums, target);
		System.out.println(Arrays.toString(hashmap1));
		System.out.println('\n');

		int[] hashmap2 = twoSum2(nums2, target2);
		System.out.println(Arrays.toString(hashmap2));
		System.out.println('\n');

		int[] hashmap3 = twoSum2(nums3, target3);
		System.out.println(Arrays.toString(hashmap3));
		System.out.println('\n');
	}

	private static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	// HashMap
	private static int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> numsHash = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			numsHash.put(nums[i], i);
		}

		numsHash.forEach((key, value) -> System.out.println(key + " " + value));

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numsHash.containsKey(complement) && numsHash.get(complement) != i) {
				return new int[] { i, numsHash.get(complement) };
			}
		}
		return null;
	}
}