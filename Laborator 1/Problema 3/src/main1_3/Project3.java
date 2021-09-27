package main1_3;

import java.text.DecimalFormat;

public class Project3 {

	public static double Average(Student[] arr) {
	    double avr = 0;
		for (Student s: arr) {
			avr += s.getSTmark();
		}
		return (Double.parseDouble(new DecimalFormat("##.##").format(avr / arr.length)));
	}
	
	public static void main(String[] args) {

		Student[] arr1 = {
				new Student ("Cristi", 20, 9.98),
				new Student("Ion", 19, 7.9),
				new Student("Andreea", 20, 8.7)
		};
		university univ1 = new university("UTM", 1988, arr1);
		univ1.UNdisplay();

		Student[] arr2 = {
				new Student ("Vlada", 19, 7.9),
				new Student("Nicolae", 20, 6.4),
				new Student("Iulia", 20, 8.25)
		};
		university univ2 = new university("ASEM", 1992, arr2);
		univ2.UNdisplay();
		
		Student[] arr3 = {
				new Student ("Petru", 20, 9.1),
				new Student("Victor", 19, 8.42),
				new Student("Daniel", 20, 8.71)
		};
		university univ3 = new university("ULIM", 1990, arr3);
		univ3.UNdisplay();
		
		System.out.print("\nMedia UTM  : " + Average(arr1));
		System.out.print("\nMedia UTM  : " + Average(arr2));
		System.out.print("\nMedia UTM  : " + Average(arr3));
	}
}
