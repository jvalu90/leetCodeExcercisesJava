/*
2413. Smallest Even Multiple

Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n. 
*/

class Solution2413 {
    public int smallestEvenMultiple(int n) {
      if (n % 2 == 0){
        return n;
    } 
    return n * 2;
    }
}