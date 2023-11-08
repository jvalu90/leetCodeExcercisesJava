/*
412. Fizz Buzz

Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
*/

class Solution412 {
  public List<String> fizzBuzz(int n) {
    List<String> response = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 ==0) {
        response.add("FizzBuzz");
        continue;
      }

      if (i % 3 == 0) {
        response.add("Fizz");
        continue;
      }

      if (i % 5 == 0) {
        response.add("Buzz");
        continue;
      }

      response.add(String.valueOf(i));
    }

    return response;        
  }
}