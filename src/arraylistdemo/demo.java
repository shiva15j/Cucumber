package arraylistdemo;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(23);
		list.add(12);
		list.add(34);
		list.add(56);

		System.out.println("List=:" + list);
		System.out.println("Size=:" + list.size());

		System.out.println("***************************");
		list.add(10);
		list.add(23);
		list.add(12);
		list.add(34);
		list.add(56);

		System.out.println("List=:" + list);
		System.out.println("Size=:" + list.size());
		System.out.println("***************************");

		list.remove(5);
		list.remove(0);
		list.remove(2);
		System.out.println("List=:" + list);
		System.out.println("Size=:" + list.size());

	}

}
