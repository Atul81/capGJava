package linkedList;

public class Reverse {

	static ListNode curr;
	static ListNode pre = null;
	static ListNode next;

	public static void reverse(ListNode listNode) {
		curr = listNode;
		while (curr != null) {
			next = curr.getNext();
			curr.setNext(pre);
			pre = curr;
			curr = next;
		}
		while (pre != null) {
			System.out.println(pre.getData());
			pre  = pre.getNext();
		}
	}

}
