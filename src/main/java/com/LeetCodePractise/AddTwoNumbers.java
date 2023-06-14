package com.LeetCodePractise;

import com.LeetCodePractise.mergeTwoLists_21.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resut = new ListNode(0);
        ListNode ptr = resut;

        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = 0+carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            sum = sum % 10;

            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        if (carry == 1) {
            ptr.next = new ListNode(1);
        }
        return resut.next;
    }
}
