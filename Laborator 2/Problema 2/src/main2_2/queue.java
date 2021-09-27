package main2_2;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	private int max_size;
	private int count = 0;
	private Queue<Integer> queue = new LinkedList<Integer>();
	
	public queue(int max_size) {		// cu max_size
		this.max_size = max_size;
		this.queue = new LinkedList<Integer>();
	}
	public queue() {					// fara max_size
		this.max_size = Integer.MAX_VALUE;
		this.queue = new LinkedList<Integer>();
	}
	
	public void isEmpty() {
		if (this.count == 0) 
			System.out.println("Coada nu contine elemente.");
		else
			System.out.println("Coada contine " + this.count + " elemente.");
	}
	
	public void isFull() {
		if (this.max_size == Integer.MAX_VALUE)
			System.out.println("Coada nu se umple niciodata.");
		else {
			System.out.println("Numarul de elemente in coada       : " + this.count);
			System.out.println("Numarul maxim de elemente in coada : " + this.max_size);
		}
	}
	
	public void afisare() {
		if (this.count == 0)
			System.out.println("[-] In coada nu sunt elemente !");
		else {
			System.out.println("[+] Coada contine " + count + " elemente :");
			System.out.println(this.queue);
		}
	}
	
	public void adauga(int el) {
		if (this.count >= this.max_size) {
			System.out.println("[-] Coada este plina !");
			System.out.println("    Nu puteti adauga elemente !");
		}
		else {
			this.queue.add(el);
			this.count ++;
			System.out.println("[+] Element " + el + " s-a adaugat.");
		}
	}
		
	public void sterge() {
		if (this.count == 0)
			System.out.println("[-] Nu sunt elemente !");
		else {
			System.out.println("[+] Element " + this.queue.peek() + " s-a sters.");
			this.queue.remove();
			this.count --;
		}
	}
	
	
}
