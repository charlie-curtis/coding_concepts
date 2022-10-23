package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LongestCommonSubSequence {

  public static void main(String[] args) {
    String s1 = "BAC";
    String s2 = "ABAC";

    System.out.println(computeLCS(s1, s2));
    System.out.println(LCS(s1, s2, new HashMap<>()));

    s1 = "the quick brown fox jumped over the lazy dog";
    //s2 = "ThisIsASubStringLoLHeyHeyHey";
    s2 = "this is a cool sentence";

    System.out.println(computeLCS(s1, s2));
    System.out.println(LCS(s1, s2, new HashMap<>()));

    s1 = "ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
    s2 = "GTCGTTCGGAATGCCGTTGCTCTGTAAA";

    System.out.println(computeLCS(s1, s2));
    System.out.println(LCS(s1, s2, new HashMap<>()));
  }

  public static int computeLCS(String x, String y) {
    if (x.length() == 0 || y.length() == 0) {
      return 0;
    }
    int[][] holder = new int[y.length() + 1][x.length() + 1];

    for (int i = 1; i < holder.length; i++) {
      for (int j = 1; j < holder[0].length; j++) {
        int optionA = holder[i][j - 1];
        int optionB = holder[i - 1][j];
        int optionC = y.charAt(i - 1) == x.charAt(j - 1) ? 1 + holder[i-1][j-1] : Integer.MIN_VALUE;
        holder[i][j] = Math.max(Math.max(optionA, optionB), optionC);
      }
    }
    return holder[y.length()][x.length()];
  }

  public static int LCS(
    String s1,
    String s2,
    HashMap<Integer, HashMap<Integer, Integer>> memo
  ) {

    if (s1.length() == 0 || s2.length() == 0) {
      //This is the base case. If one of the strings are empty, the LCS is going to be 0
      return 0;
    }
    if (memo.containsKey(s1.length()) && memo.get(s1.length()).containsKey(s2.length())) {
      //return the cached version
      return memo.get(s1.length()).get(s2.length());
    }
    //Grab the last character from each string
    char a = s1.charAt(s1.length() - 1);
    char b = s2.charAt(s2.length() - 1);
    //go through the cases
    int result;
    if (a == b) {
      //this WILL be part of the LCS
      result = LCS(s1.substring(0, s1.length() - 1), s2.substring(0, s2.length() - 1), memo) + 1;
    } else {
      //assume the last character of s1 won't appear in the LCS, so it won't hurt to remove it
      int optionA = LCS(s1.substring(0, s1.length() - 1), s2, memo);
      //assume the last character of s2 won't appear in the LCS, so it won't hurt to remove it
      int optionB = LCS(s1, s2.substring(0, s2.length() - 1), memo);
      result = Math.max(optionA, optionB);
    }
    HashMap<Integer, Integer> firstIndex = memo.getOrDefault(s1.length(), new HashMap<>());
    firstIndex.put(s2.length(), result);
    memo.put(s1.length(), firstIndex);
    return result;
  }
}
