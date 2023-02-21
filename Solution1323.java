/*
1323. Maximum 69 Number

You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
*/

class Solution1323 {
  public int maximum69Number (int num) {
    int response = 0;
    if(num == 9999 || num == 999 || num == 99 || num ==9) return num;

    for(int i = 3; i >= 0; i--) {
      if((num / (int) Math.pow(10, i)) % 10 == 6) {
        response = num + 3 * (int) Math.pow(10, i);
        break;
      }      
    }
    return response;
  }
}