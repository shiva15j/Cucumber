package exceptiondemo;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Num1=:");
		int num1 = sc.nextInt();

		System.out.println("Num2=:");

		int num2 = sc.nextInt();

		try {
			int div = num1 / num2;

			System.out.println("The div=:" + div);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

		System.out.println("Compilation Continues................");

	}

}
