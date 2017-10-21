package pl.atena.edu.akdaemia6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Kolejki {

	public static void main(String[] args) {

		//Stos LIFO
		Deque<String> stos = new ArrayDeque<String>();
		stos.push("Piotrek");
		stos.push("Paweł");
		stos.push("Agata");
		stos.push("Czesiek");
		
		stos.forEach(System.out::println);
		
		System.out.println();
		
		//Kolejka FIFO
		Queue<String> stos2 = new ArrayDeque<String>();
		stos2.add("Piotrek");
		stos2.add("Paweł");
		stos2.add("Agata");
		stos2.add("Czesiek");
		
		stos2.forEach(System.out::println);
		System.out.println();
		
		//Pobiera pierwszy element z kolejki i go usuwa
		System.out.println(stos2.poll());
		System.out.println();
		stos2.forEach(System.out::println);
		System.out.println();
		
		//Pobiera pierwszy element z kolejki i go nie usuwa
		System.out.println(stos2.peek());
		System.out.println();
		stos2.forEach(System.out::println);
		
	}

}
