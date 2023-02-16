/*
1290. Convert Binary Number in a Linked List to Integer

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.
*/

class Solution1290 {
  public int getDecimalValue(ListNode head) {
    String response = "";

    for(var node = head; node != null; node = node.next) {
      response += node.val;
    }    
    return Integer.parseInt(response, 2);      
  }
}