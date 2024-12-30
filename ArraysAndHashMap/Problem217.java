/*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    Example 1:
    Input: nums = [1,2,3,1]
    Output: true

    Explanation:
    The element 1 occurs at the indices 0 and 3.

    Example 2:
    Input: nums = [1,2,3,4]
    Output: false

    Explanation:
    All elements are distinct.

    Example 3:
    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true

    Constraints:
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
*/ 
import java.util.HashSet;
import java.util.Set;

public class Problem217 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> noDuplicateNums = new HashSet<>(); //usamos set porque no permite duplicados
        
        for (int num : nums) {
            if (!noDuplicateNums.add(num)) { //validamos de manera negativa porque al existir el elemento en la lista no lo va a poder agregar
                return true;
            }
        }
        
        return false;
    }
}
