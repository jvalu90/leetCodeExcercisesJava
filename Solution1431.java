import java.util.List;
import java.util.*;

/*
1431. Kids With the Greatest Number of Candies

There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
*/

  
class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int maximumCandies = 0;
      for(int count:candies){
        maximumCandies = Math.max(count,maximumCandies);
      }
      
      List<Boolean> result = new ArrayList<>();
        
      for(int count:candies ){
        result.add(count+extraCandies >= maximumCandies);
      }
        
      return result;
    }
  
}