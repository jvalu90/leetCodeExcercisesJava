/*
1304. Find N Unique Integers Sum up to Zero

Given an integer n, return any array containing n unique integers such that they add up to 0.
*/

class Solution1304 {
  public int[] sumZero(int n) {
    int[] response = new int[n];
    int j = 1;
    if (n == 1) {
      return response;
    }

    for (int i = 0; i < n /2; i++) {
      response[i] = j;
      response[n - 1 -i] = -j;
      j++;
    }
    return response;          
  }  
}