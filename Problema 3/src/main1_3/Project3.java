package main1_3;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Project3 {

	public static double Average(ArrayList<Object> list) {
        Object[] arr = list.toArray();
        double count = 0.0;
        
        for (Object ar : arr) {
            String a = ar.toString();
            String st[] = a.split(" ");
            double mark = Double.parseDouble(st[2]);
            count += mark;
        }
        return (Double.parseDouble(new DecimalFormat("##.##").format(count / arr.length)));
    }
	
	public static void main(String[] args) {
		university st11 = new university("Cristi", 20, 9.98);
		university st12 = new university("Ion", 19, 7.9);
		university st13 = new university("Andreea", 20, 8.7);
		ArrayList<Object> arr1 = new ArrayList<Object>();
		arr1.add(st11);
		arr1.add(st12);
		arr1.add(st13);
		university univ1 = new university("UTM", 1988, arr1);
		univ1.UNdisplay();
		
		university st21 = new university("Vlada", 19, 7.9);
		university st22 = new university("Nicolae", 20, 6.4);
		university st23 = new university("Iulia", 20, 8.25);
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr2.add(st21);
		arr2.add(st22);
		arr2.add(st23);
		university univ2 = new university("ASEM", 1992, arr2);
		univ2.UNdisplay();
		
		university st31 = new university("Petru", 20, 9.1);
		university st32 = new university("Victor", 19, 8.42);
		university st33 = new university("Daniel", 20, 8.71);
		ArrayList<Object> arr3 = new ArrayList<Object>();
		arr3.add(st31);
		arr3.add(st32);
		arr3.add(st33);
		university univ3 = new university("ULIM", 1990, arr3);
		univ3.UNdisplay();
		
		System.out.print("\nMedia UTM  : ");
		double av1 = Average(arr1);
		System.out.println(av1);
		
		System.out.print("Media ASEM : ");
		double av2 = Average(arr2);
		System.out.println(av2);
		
		System.out.print("Media ULIM : ");
		double av3 = Average(arr3);
		System.out.println(av3);
	}
}
