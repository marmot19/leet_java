package main.cczq.zrh;

import java.util.List;

public class Solutions61 {
	public class ListNode {
		int val;
		ListNode next;
		public ListNode(int x) {
			// TODO Auto-generated constructor stub
			val = x;
		}
	}
	
	public ListNode rotateRight(ListNode head, int k) {
        int n = 1;
        if(head == null) return head;
        ListNode end = head;
        while(end.next != null){
            n++;
            end = end.next;
        }
        if(n<2) return head;
        ListNode n1 = head;
        ListNode n2 = head;
        int moves = k%n;
        if(moves ==0) return head;
        for(int i=0;i<(n-moves);i++) {
        	n2 = n2.next;
        }
        for(int j=1;j<(n-moves);j++) {
        	n1 = n1.next;
        }
        ListNode ans = n2;
        n1.next = null;
        end.next = head;
        return ans;
        
    }
	
	public static void main(String[] args) {
		Solutions61 s = new Solutions61();
		ListNode n1 = s.new ListNode(1);
		ListNode n2 = s.new ListNode(2);
		ListNode n3 = s.new ListNode(3);
		ListNode n4 = s.new ListNode(4);
		ListNode n5 = s.new ListNode(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		System.out.println(s.rotateRight(n1, 2));
		
	}
}
