/*
1374. Generate a String With Characters That Have Odd Counts

Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  
*/

class Solution1374 {
  public String generateTheString(int n) {
    char[] chars = {'a', 'b'};
    StringBuilder sb = new StringBuilder();

    if (n % 2 != 0) {
      for (int i = 0; i < n; i++) {
        sb.append(chars[0]);
      }      
    } else {
      for (int i = 0; i < n - 1; i++) {
        sb.append(chars[0]);
      }

      sb.append(chars[1]);
    }
    
    return sb.toString();
  }
}