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

public class Problem1
{
    public static void Main(string[] args)
    {
        int[] nums = [2, 7, 11, 15];
        var target = 9;
        Console.WriteLine(string.Join(", ", twoSum(nums, target)));
        Console.WriteLine(string.Join(", ", twoSum2(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.Length; i++)
        {
            for (int j = i + 1; j < nums.Length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return new int[] { i, j };
                }
            }
        }
        return nums;
    }


    private static int[] twoSum2(int[] nums, int target)
    {
        Dictionary<int, int> dictionary = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++)
        {
           if(dictionary.TryGetValue(nums[i], out int dictionaryIndex)){
                return new int[]{dictionaryIndex, i};
           }
           dictionary[target - nums[i]] = i;
        }
        return nums;
    }
}

