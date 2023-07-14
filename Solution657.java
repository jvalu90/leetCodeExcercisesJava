/*
657. Robot Return to Origin

There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once, 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.
*/

class Solution657 {
  public boolean judgeCircle(String moves) {
    int[] move = new int[2];

    for (int i = 0; i < moves.length(); i++) {
      move = moveRobot(moves.charAt(i), move);
    }

    return move[0] == 0 && move[1] == 0;
  }

  private int[] moveRobot(char move, int[] pointer) {
    switch (move) {
      case 'R':
        pointer[0]++;
        return pointer;
      case 'L':
        pointer[0]--;
        return pointer;
      case 'U':
        pointer[1]++;
        return pointer;
      case 'D':
        pointer[1]--;
        return pointer;
      default:
        return pointer;
    }
  }
}