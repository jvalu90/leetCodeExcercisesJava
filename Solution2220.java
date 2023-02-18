/*
2220. Minimum Bit Flips to Convert Number

A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.

    For example, for x = 7, the binary representation is 111 and we may choose any bit (including any leading zeros not shown) and flip it. We can flip the first bit from the right to get 110, flip the second bit from the right to get 101, flip the fifth bit from the right (a leading zero) to get 10111, etc.

Given two integers start and goal, return the minimum number of bit flips to convert start to goal.
*/

class Solution2220 {
  public int minBitFlips(int start, int goal) {
    String startString = Integer.toString(start, 2);
    String goalString = Integer.toString(goal, 2);
    int response = 0;

    if (startString.length() > goalString.length()) {
      while(startString.length() != goalString.length()) {
        goalString = "0" + goalString;
      }      
    } else if (goalString.length() > startString.length()) {
      while(startString.length() != goalString.length()) {
        startString = "0" + startString;
      } 
    }

    for(int i = 0; i < startString.length(); i++) {
      if(startString.charAt(i) != goalString.charAt(i)) response++;
    }

    return response;
  }
}