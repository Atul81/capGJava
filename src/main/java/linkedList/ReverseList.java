package linkedList;

public class ReverseList {
	static ListNode i;

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);

		listNode.setNext(listNode2);
		listNode2.setNext(listNode3);
		listNode3.setNext(listNode4);
		listNode4.setNext(null);
		Reverse.reverse(listNode);
		ListNode prev = ReverseRecursio.reverse(listNode);
		
		while (prev != null) {
			System.out.println(prev.getData() + "Second one");
			prev  = prev.getNext();
		}
	}
}
