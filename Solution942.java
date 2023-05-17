/*
942. DI String Match

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

    s[i] == 'I' if perm[i] < perm[i + 1], and
    s[i] == 'D' if perm[i] > perm[i + 1].

Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
*/

class Solution942 {
  public int[] diStringMatch(String S) {
    int  length= S.length();
    int[] arr=new int[length+1];
    int fp=0;
    int lp=length;

    for(int i=0;i<length;i++) {
      if(S.charAt(i)=='I') {
        arr[i]=fp;
        fp++;
      } else {
        arr[i]=lp;
        lp--;
      }
    }
    
    arr[length]=fp;        
    return arr;
  }
}