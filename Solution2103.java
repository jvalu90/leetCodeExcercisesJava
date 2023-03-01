/*
2103. Rings and Rods

There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9.

You are given a string rings of length 2n that describes the n rings that are placed onto the rods. Every two characters in rings forms a color-position pair that is used to describe each ring where:

    The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
    The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').

For example, "R3G2B1" describes n == 3 rings: a red ring placed onto the rod labeled 3, a green ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.

Return the number of rods that have all three colors of rings on them.
*/

import java.util.*;

class Solution2103 {
  public int countPoints(String rings) {
    int response = 0;
    Map<String, Set<String>> mapper = new HashMap<>();

    for (int i = 0; i < rings.length() - 1; i+=2) {
      // validar si la key existe con la posicion i
      // Si existe sumar al set la posicion i + 1, de lo contrario a
      // Utilizar el compute ifPresent de
    }
    String example = "ch";
    System.out.println(String.valueOf(example.charAt(0)));
    return response;
  }
}