/*
728. Self Dividing Numbers

A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
*/

import java.util.*;

class Solution728 {
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> response = new ArrayList<Integer>();

    for (int i = left; i <= right; i++) {
      if(checkDivisible(i)) response.add(i);      
    }

    return response;
  }

  private boolean checkDivisible(int number) {
    int temp = number;
    while(number > 0){            
      int rem = number % 10;
        
      if(rem == 0){
        return false;
      } else if (temp % rem != 0){
        return false;
      }

      number = number / 10;
    }

    return true;
  }  
}