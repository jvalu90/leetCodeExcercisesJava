/*
832. Flipping an Image

Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

    For example, flipping [1,1,0] horizontally results in [0,1,1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

    For example, inverting [0,1,1] results in [1,0,0].
*/

class Solution832 {
  public int[][] flipAndInvertImage(int[][] image) {
    int n = image.length;
    int[][] newImage = new int[n][n];
    for (int i = 0; i < n; i++) {
      newImage[i] = getFlipAndInvertRow(image[i]);
    }
    return newImage;
  }

  private int[] getFlipAndInvertRow(int[] row) {
    int rowLength = row.length - 1;
    int[] newRow = new int[rowLength + 1];

    for (int i = 0; i <= rowLength; i++) {
      newRow[i] = invertBit(row[rowLength - i]);
    } 

    return newRow;
  }

  private int invertBit(int bit) {
    if (bit == 0) return 1;
    return 0;
  }
}