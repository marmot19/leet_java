package main.cczq.zrh;

import java.util.List;

public class Solutions24 {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		
	}
	
	public ListNode swapPairs(ListNode head) {
        return reverseNode(head, 2);
    }
	
	public ListNode reverseNode(ListNode head, int n) {
		ListNode temp = head;
		ListNode temp2 = head;
		
		for(int i=1;i<=n;i++) {
			//判断链表是否小于n
			if(temp == null) {
				return head;
			}
			temp = temp.next;
		}
		head = temp.next;
		temp.next = null;
		ListNode rtemp  = reverse(temp2);
		rtemp.next = reverseNode(head, n);
		
		return rtemp;
		
		
	}
	
	public ListNode reverse(ListNode node) {
//		if(node == null || node.next == null) return node;
//		ListNode next = node.next;
//		node.next = reverse(next.next);
//		next.next = node;
		return node;
	}
	
	public static void main(String[] args) {
		Solutions24 solutions24 = new Solutions24();
		ListNode l1 = solutions24.new ListNode(1);
		ListNode l2 = solutions24.new ListNode(2);
		ListNode l3 = solutions24.new ListNode(3);
		ListNode l4 = solutions24.new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		
		solutions24.swapPairs(l1);
		StringBuilder sb = new StringBuilder();
		while(l1 != null) {
			sb.append(l1.val);
			sb.append("-");
			l1 = l1.next;
		}
		System.out.println(sb.toString());
	}
}
