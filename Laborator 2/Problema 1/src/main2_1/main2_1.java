package main2_1;

import java.util.*;

public class main2_1 {

	public static void main(String[] args) {
		
		// box1
		box box1 = new box();
		System.out.println("Primul obiect de tip box :");
		box1.display_box();
		
		// box2
		Scanner sc = new Scanner(System.in);
		System.out.println("\n[+] Introduceti valoarea pentru dimensiuni : ");
		int val = sc.nextInt();
		box box2 = new box(val);
		System.out.println("Al doilea obiect de tip box :");
		box2.display_box();
		
		// box3
		int h, w, d;
		System.out.println("\n[+] Introduceti parametrii pentru al 3-lea obiect. ");
		System.out.println("> Inaltimea : ");
		h = sc.nextInt();
		System.out.println("> Latime    : ");
		w = sc.nextInt();
		System.out.println("> Adancime  : ");
		d = sc.nextInt();
		box box3 = new box(h, w, d);
		System.out.println("Al treilea obiect de tip box :");
		box3.display_box();
		
		System.out.println("[+] Aria    la box 3 : " + box3.aria() + " u.p.");
		System.out.println("[+] Volumul la box 3 : " + box3.volum() + " u.c.");
		
		sc.close();
	}
}
