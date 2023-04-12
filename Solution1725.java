/*
1725. Number Of Rectangles That Can Form The Largest Square

You are given an array rectangles where rectangles[i] = [li, wi] represents the ith rectangle of length li and width wi.

You can cut the ith rectangle to form a square with a side length of k if both k <= li and k <= wi. For example, if you have a rectangle [4,6], you can cut it to get a square with a side length of at most 4.

Let maxLen be the side length of the largest square you can obtain from any of the given rectangles.

Return the number of rectangles that can make a square with a side length of maxLen.
*/

import java.util.Arrays;

class Solution1725 {
  public int countGoodRectangles(int[][] rectangles) {
    int[] minSides = new int[rectangles.length];

    for(int i = 0; i < rectangles.length; i++) {
      minSides[i] = minSide(rectangles[i]);
    }

    Arrays.sort(minSides);    
    
    return maxLenCount(minSides);
  }

  private int minSide(int[] rectangle) {
    return Math.min(rectangle[0], rectangle[1]);
  }

  private int maxLenCount(int[] minSides) {
    int response = 0;
    int max = minSides[minSides.length - 1];

    if(minSides.length < 2) return response + 1;

    for (int i = minSides.length - 1 ; i >= 0; i--) {
      if(minSides[i] == max) response++;
    }

    return response;
  }
}