/*
2859. Sum of Values at Indices With K Set Bits

You are given a 0-indexed integer array nums and an integer k.

Return an integer that denotes the sum of elements in nums whose corresponding indices have exactly k set bits in their binary representation.

The set bits in an integer are the 1's present when it is written in binary.

    For example, the binary representation of 21 is 10101, which has 3 set bits.
*/

class Solution2859 {
  public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
    int response = 0;

    for (int i = 0; i < nums.size(); i++) {
      if (validateBinary(i, k)) response += nums.get(i);
    }

    return response;
  }

  private boolean validateBinary(int number, int k) {
    int bits = 0;
    String binary = Integer.toBinaryString(number);
    for (int i = 0; i < binary.length(); i++) {
      if ('1' == binary.charAt(i)) bits++;
    }

    return bits == k;
  }
}