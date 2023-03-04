/*
2418. Sort the People

You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.
*/

class Solution2418 {
  public String[] sortPeople(String[] names, int[] heights) {
    String[] response = new String[names.length];
    response[0] = names[0];

    for (int i = 1; i < names.length; i++) {
      if(heights[i] > heights[i - 1]) {
        String aux = response[i - 1];
        response[i - 1] = names[i];
        response[i] = aux;
      } else {
        response[i] = names[i];
      }          
    }
   
    return response;
  }
  
}