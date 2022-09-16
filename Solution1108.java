/*
1108. Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
*/

public class Solution1108 {
  public String defangIPaddr(String address) {
      String answer = "";
      for(char c: address.toCharArray()) {
        if(c == '.') {
          answer += "[.]";
          continue;
        }
        answer += c;
      }
      return answer;
    }
}
