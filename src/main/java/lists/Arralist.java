package lists;

import java.io.*;
import java.util.*;

public class Arralist {
	
	public static class items {
		int data;
		int param;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public int getParam() {
			return param;
		}
		public void setParam(int param) {
			this.param = param;
		}
	}

	public static void main(String[] args) throws IOException {
		// size of ArrayList
		items name = new items();
		int n = 5;
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		// Appending the new element at the end of the list
		name.setData(5);
		name.setParam(5);
		for (int i = 1; i <= n; i++) {
			arrli.add(name.getData());
		}

		// Printing elements
		System.out.println(arrli);

		// Remove element at index 3
		// arrli.remove(3);

		// Displaying ArrayList after deletion
		System.out.println(arrli);

		// Printing elements one by one
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
}