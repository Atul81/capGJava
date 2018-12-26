package trees;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TreeData {

	public static void main(String... a) {
		TreeInvoc invoc = new TreeInvoc();
		TreeInvoc invoc1 = new TreeInvoc();
		TreeInvoc invoc2 = new TreeInvoc();
		TreeInvoc invoc3 = new TreeInvoc();
		invoc.setData(4);
		invoc.setLeftNode(invoc1);
		invoc.setRightNode(invoc2);
		invoc1.setData(8);
		invoc2.setData(5);
		invoc3.setData(6);
		invoc2.setLeftNode(invoc3);
		/*
		 * System.out.println(invoc.getData()); System.out.println(invoc1.getData());
		 * System.out.println(invoc2.getData()); System.out.println(invoc3.getData());
		 */
		TreeData data = new TreeData();
		int x = data.findMax(invoc);
		int y = data.FindMax(invoc);
		System.out.println(x + "    Second one     " + y);
	}

	int findMax(TreeInvoc para) {
		int max = Integer.MIN_VALUE;
		if (para == null) {
			return max;
		}
		int left = findMax(para.getLeftNode());
		int right = findMax(para.getRightNode());
		if (left > right)
			max = left;
		else
			max = right;
		if (para.getData() > max)
			max = para.getData();

		// System.out.println(left + " " + right + "" + max);
		return max;
	}

	int FindMax(TreeInvoc invoc) {
		int max = Integer.MIN_VALUE;
		if (invoc == null)
			return max;
		Queue<TreeInvoc> invocs = new LinkedList<TreeInvoc>();
		invocs.offer(invoc);
		while (!invocs.isEmpty()) {
			TreeInvoc invoc2 = invocs.poll();
			if (invoc2.getData() > max)
				max = invoc2.getData();
			if (invoc2 != null) {
				if (invoc2.getLeftNode() != null)
					invocs.offer(invoc2.getLeftNode());
				if (invoc2.getRightNode() != null)
					invocs.offer(invoc2.getRightNode());
			}
		}
		return max;
	}
}
