// Problem:
// You are given two strings word1 and word2. 
// Merge the strings by adding letters in alternating order, starting with word1. 
// If a string is longer than the other, append the additional letters onto the end of the merged string.

//Example 1:
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r

// Example 2:
// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s

// Example 3:
// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q 
// merged: a p b q c   d

public class Problem1768 {
	public static void main(String[] args) {

		System.out.println("Example 1");
		System.out.println("ExpectedResult: apbqcr");
		System.out.println("FunctionResult: " + Solution("abc", "pqr"));
		System.out.println();
		System.out.println("Example 2");
		System.out.println("ExpectedResult: apbqrs");
		System.out.println("FunctionResult: " + Solution("ab", "pqrs"));
		System.out.println();
		System.out.println("Example 3");
		System.out.println("ExpectedResult: apbqcd");
		System.out.println("FunctionResult: " + Solution("abcd", "pq"));
	}

	private static String Solution(String word1, String word2) {
		StringBuffer newString = new StringBuffer();
		int n = Math.min(word1.length(), word2.length());
		for (int i = 0; i < n; i++) {
			newString.append(word1.charAt(i));
			newString.append(word2.charAt(i));
		}
		newString.append(word1.substring(n));
		newString.append(word2.substring(n));
		return newString.toString();
	}

}