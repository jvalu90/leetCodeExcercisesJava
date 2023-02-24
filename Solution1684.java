/*
1684. Count the Number of Consistent Strings

You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.
*/

class Solution1684 {
  public int countConsistentStrings(String allowed, String[] words) {
    int count = 0; 
    boolean check = true;
    
    for(int i = 0; i < words.length; i++){
      char[]  temp = words[i].toCharArray();
      
      for(int j = 0; j < temp.length; j++) {      
        if(!allowed.contains(Character.toString(temp[j]))){
          check = false;
          break;
        }
      }
      
      if(check == true){
        count++;
      }
      else {
        check = true;
      }
    }
    return count;
  }
}