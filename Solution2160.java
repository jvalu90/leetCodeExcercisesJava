/*
2160. Minimum Sum of Four Digit Number After Splitting Digits

You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.

    For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].

Return the minimum possible sum of new1 and new2.
*/

//import java.util.stream.*;  
import java.util.*;

public class Solution2160 {
  public int minimumSum(int num) {
    int[] numArray = new int[4];
    
    for(int i = 0; i < 4; i++){
      numArray[i] = num % 10;
      num /= 10;
    }
    
    Arrays.sort(numArray);
    return numArray[0]*10 + numArray[2] + numArray[1]*10 + numArray[3];      
  }
}