namespace LeetCode.Problems;

public class Problem217
{
    public static void BusinessLogic()
    {
        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        Console.WriteLine(ContainsDuplicate(nums1));
        Console.WriteLine(ContainsDuplicate(nums2));
        Console.WriteLine(ContainsDuplicate(nums3));
    }


    public static bool ContainsDuplicate(int[] nums)
    {
        HashSet<int> noDuplicateNums = new HashSet<int>();

        foreach (int num in nums)
        {
            if (!noDuplicateNums.Add(num))
            {
                return true;
            }
        }

        return false;
    }

}
