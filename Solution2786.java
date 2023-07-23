/*
2716. Minimize String Length

Given a 0-indexed string s, repeatedly perform the following operation any number of times:

    Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the left of i (if any) and the closest occurrence of c to the right of i (if any).

Your task is to minimize the length of s by performing the above operation any number of times.

Return an integer denoting the length of the minimized string.
*/

class Solution2786 {
  public int minimizedStringLength(String s) {
    int[] bucket = new int[122];
    int response = 0;

    for (int i = 0; i < s.length(); i++) {
      bucket[s.charAt(i)]++;
    }

    for (int i = 97; i < bucket.length; i++) {
      if (bucket[i] != 0) response++;
    }

    return response;
  }
}