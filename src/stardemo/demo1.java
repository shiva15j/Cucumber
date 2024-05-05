package stardemo;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("n=:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
