package linkedList;


public class DataInsertion {
	static ListNode i;
	public DataInsertion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		
		listNode.setNext(listNode2);
		listNode2.setNext(listNode3);
		listNode2.setPrev(listNode);
		listNode3.setPrev(listNode2);
		
		/*System.out.println(listNode.getData() + " next " + listNode.getNext() + "previous " + listNode.getPrev());
		System.out.println(listNode2.getData() + "  " + listNode2.getNext() + "previous " + listNode2.getPrev());
		System.out.println(listNode3.getData() + "  " + listNode3.getNext() + "previous " + listNode3.getPrev());*/
		i = listNode;
		int x = 9;
		int y = x==9 ? 0 : 6;
		if(x == 9)
			System.out.println("Yes" + "Value of y"+ y);
		
		while ( i != null ) {
			//System.out.println(i.getData());
			if(i.getData() == 3) {
				System.out.println("Got the place for insertion");
				listNode3.setNext(listNode4);
				listNode4.setPrev(i.getPrev());
				listNode4.setNext(null);
			}
			System.out.println(i.getData() + " Next Pointer" + i.getNext()+ "Previous" + i.getPrev());
			i = i.getNext();
		}
	}

}
