/*
461. Hamming Distance

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.
*/

class Solution461 {
  public int hammingDistance(int x, int y) {
    int response = 0;
    String bin = Integer.toBinaryString(x ^ y);
    for (int i = 0; i < bin.length(); i++) {
      if (bin.charAt(i) == '1') response++;
    }
    return response;
  }
}