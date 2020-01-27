package old.linkedList;

public class ReverseRecursion {
	
	static ListNode prev = null;
	static ListNode next = null;
	static ListNode curr = null;
	public static ListNode reverse(ListNode listNode) {
		curr = listNode;
		if(curr == null) {
			return prev;
		}
		curr.setNext(prev);
		next = curr.getNext();
		return reverse(curr);
	}
}
