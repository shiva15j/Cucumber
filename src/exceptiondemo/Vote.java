package exceptiondemo;

import java.util.Scanner;

public class Vote {
	
	
	public static void age() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age=:");
		
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("You can vote");
		}
		else {
			throw new Exception("Invalid age");
		}
		
		
		
		
	}

}
