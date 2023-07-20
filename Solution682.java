/*
682. Baseball Game

You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

    An integer x.
        Record a new score of x.
    '+'.
        Record a new score that is the sum of the previous two scores.
    'D'.
        Record a new score that is the double of the previous score.
    'C'.
        Invalidate the previous score, removing it from the record.

Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
*/

import java.util.*;

class Solution682 {
  public int calPoints(String[] operations) {
    List<Integer> scores = new ArrayList<>();

    for (String operation : operations) {
      scores = setOperations(scores, operation);
    }

    return scores.stream().mapToInt(Integer::intValue).sum();
  }

  private List<Integer> setOperations(List<Integer> scores, String operation) {
    switch (operation) {
      case "+":
        scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 1));
      case "D":
        scores.add(scores.get(scores.size() - 1) * 2);
      case "C":
        scores.remove(scores.get(scores.size() - 1));
      default:
        scores.add(Integer.valueOf(operation));
    }

    return scores;
  }
}