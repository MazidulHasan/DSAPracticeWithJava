package com.LeetCodePractise;

import com.LeetCodePractise.mergeTwoLists_21.ListNode;

public class Convert_Binary_Number {
    public int getDecimalValue(ListNode head) {
     int res =0;
     while(head !=null){
         res*=2;
         res+=head.val;
         head=head.next;
     }
     return res;
    }
}
