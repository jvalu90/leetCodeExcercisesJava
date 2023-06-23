/*
338. Counting Bits

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
*/

class Solution338 {
  public int[] countBits(int n) {
    int[] response = new int[n+1];
    for (int i = 0; i <= n; i++) {
      response[i] = countFromBinary(Integer.toBinaryString(i));
    }

    return response;
  }

  private int countFromBinary(String binary) {
    int count = 0;

    for (int i = 0; i < binary.length(); i++) {
      if(binary.charAt(i) == '1') count++;
    }

    return count;
  }
  
}