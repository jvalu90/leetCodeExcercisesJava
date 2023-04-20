/*
1812. Determine Color of a Chessboard Square

You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.

Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.
*/

class Solution1812 {
  public boolean squareIsWhite(String coordinates) {
    return (coordinates.charAt(0) - 'a' - coordinates.charAt(1) - '1') % 2 != 0;
  }
}