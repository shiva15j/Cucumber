package listdemo;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(3);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);

		System.out.println("************************");
		System.out.println("List=:" + list);
		System.out.println("Size=:" + list.size());

		list.add(3);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);

		System.out.println("************************");
		System.out.println("List=:" + list);
		System.out.println("Size=:" + list.size());

		list.remove(4);
		list.remove(7);
		list.remove(9);

		System.out.println("************************");
		System.out.println("List=:" + list);
		System.out.println("Size=:" + list.size());

//		for (Integer el : list) {
//			System.out.println(el);
//		}

	}

}
