/*
2396. Strictly Palindromic Number

An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive), the string representation of the integer n in base b is palindromic.

Given an integer n, return true if n is strictly palindromic and false otherwise.

A string is palindromic if it reads the same forward and backward.
*/

class Solution2396 {
  public boolean isStrictlyPalindromic(int n) {
    boolean flag=false;

    for(int i=2;i<=n-2;i++){
      String s=convrt(n,i);
      flag=check(s);
      if (flag==false){
        return false;
      }  
    }
    return flag;
  }

  boolean check(String s){
    int i=0;
    int j=s.length()-1;

    while(i<=j){
      if(s.charAt(i)!=s.charAt(j)){
        return false;
      } else{
        i++;
        j--;
      }

    }
    return true;
  } 

  String convrt(int a,int b){
    String s1="";
    while(a>=b){
      s1+=a%b;
      a=a/b;           
    }
    return s1+a;
  }
}