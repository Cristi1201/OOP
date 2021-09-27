package main2_2;

import java.util.Scanner;

public class main2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q1 = new queue();
		System.out.println("[+] Prima coada s-a creat.");
		Scanner sc = new Scanner(System.in);
		System.out.println("> Introduceti marimea maxima la coada 2 : ");
		int max_size = sc.nextInt();
		queue q2 = new queue(max_size);
		System.out.println("[+] A 2-a coada s-a creat.");
		
		System.out.println("\n Operatiuni cu I-a coada : ");
		q1.adauga(1);
		q1.adauga(2);
		q1.adauga(3);
		q1.afisare();
		q1.sterge();
		q1.afisare();	
		
		System.out.println("\n Operatiuni cu a II-a coada : ");
		q2.isFull();
		q2.adauga(11);
		q2.adauga(12);
		q2.adauga(13);
		q2.afisare();
		q2.sterge();
		q2.afisare();
		q2.isEmpty();
	}

}
