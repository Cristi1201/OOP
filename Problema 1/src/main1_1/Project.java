package main1_1;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Monitor mon1 = new Monitor("alb", 46, 34, 1024);
		
		System.out.println("Datele I monitor sunt : ");
		mon1.display();
		
		System.out.println("\nIntroduceti datele monitorului :");
		System.out.println("1) Culoare : ");
		String color = sc.nextLine();
		System.out.println("2.1) Dimensiune x : ");
		int d_x = sc.nextInt();
		System.out.println("2.2) Dimensiune y : ");
		int d_y = sc.nextInt();
		System.out.println("3) Rezolutie : ");
		int res = sc.nextInt();
		Monitor mon2 = new Monitor(color, d_x, d_y, res);
		
		System.out.println("\nDatele II monitor sunt : ");
		mon2.display();
		
		comparare(mon1, mon2);
		
		sc.close();
		mon1.delete_Monitor(mon1);
		mon2.delete_Monitor(mon2);
	}
	
	static void comparare(Monitor m1, Monitor m2) {
		System.out.println("\nCuloare I monitor  : " + m1.color);
		System.out.println("Culoare II monitor : " + m2.color);
		if (m1.dimension_x > m2.dimension_x) 
			System.out.println("Monitor I are dimensiunea x mai mare : " + m1.dimension_x + ", fata de al II-lea monitor : " + m2.dimension_x);
		else 
			System.out.println("Monitor II are dimensiunea x mai mare : " + m2.dimension_x + ", fata de I-ul monitor : " + m1.dimension_x);
		if (m1.dimension_y > m2.dimension_y) 
			System.out.println("Monitor I are dimensiunea y mai mare : " + m1.dimension_y + ", fata de al II-lea monitor : " + m2.dimension_y);
		else 
			System.out.println("Monitor II are dimensiunea y mai mare : " + m2.dimension_y + ", fata de I-ul monitor : " + m1.dimension_y);
		if (m1.resolution > m2.resolution) 
			System.out.println("Monitor I are rezolutia mai mare : " + m1.resolution + ", fata de al II-lea monitor : " + m2.resolution);
		else 
			System.out.println("Monitor II are rezolutia mai mare : " + m2.resolution + ", fata de I-ul monitor : " + m1.resolution);
	}	
}


