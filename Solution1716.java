/*
1716. Calculate Money in Leetcode Bank

Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.

He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.

Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
*/

class Solution1716 {
  public int totalMoney(int n) {
    int weeks = n / 7;
    int days = n % 7;        
    return ((weeks * (weeks - 1)) / 2) * 7 + weeks * 28 + ((days * (days + 1)) / 2) + (weeks * days);
  }
}