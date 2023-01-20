/*
1773. Count Items Matching a Rule

You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

    ruleKey == "type" and ruleValue == typei.
    ruleKey == "color" and ruleValue == colori.
    ruleKey == "name" and ruleValue == namei.

Return the number of items that match the given rule.
*/

import java.util.*;

class Solution1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
      Map<String, Integer> map = new HashMap<>();
      map.put("type", 0);
      map.put("color", 1);
      map.put("name", 2);

      return items.stream().filter(element -> element.get(map.get(ruleKey)).equals(ruleValue)).toList().size();
    }
}