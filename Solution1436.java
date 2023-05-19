/*
1436. Destination City

You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
*/

import java.util.*;

class Solution1436 {
  public String destCity(List<List<String>> paths) {
     for(List<String> path: paths) {
       if(!checkCity(paths, path.get(1))) return path.get(1);
     }

    return null;
  }

  private boolean checkCity(List<List<String>> paths, String city) {
    for(List<String> path: paths) {
      if(path.get(0).equals(city)) return true;
    }

    return false;
  }
}