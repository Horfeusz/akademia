package pl.atena.edu.akdaemia1;

import java.util.Scanner;

public class PoleP {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Podaj wartoœæ boku a: ");
		String sa = scanner.nextLine();

		System.out.println("Podaj wartoœæ boku b: ");
		String sb = scanner.nextLine();

		int a = 0;
		int b = Integer.parseInt(sb);


		
		
		
		
		
		try {
			a = Integer.valueOf(sa);
		} catch (Exception e) {
			System.out.println("A nie jest liczb¹ !!!!! ");
		}
		
				
		int result = a * b;

		System.out.println(result);

	}

}
