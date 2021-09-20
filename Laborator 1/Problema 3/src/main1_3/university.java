package main1_3;

import java.util.ArrayList;

public class university {
	private String UNname;
	private int UNfoundationYear;
	
	private String STname;
	private int STage;
	private double STmark;
	
	private ArrayList<Object> Student;
	
	// student
	public university(String STname, int STage, double STmark) {
		this.STname = STname;
		this.STage = STage;
		this.STmark = STmark;
	}
	// university
	public university(String UNname, int UNfoundationYear, ArrayList<Object> Student) {
		this.UNname = UNname;
		this.UNfoundationYear = UNfoundationYear;
		this.Student = Student;
	}
	
	public ArrayList<Object> getStudent() {
        return this.Student;
    }
	
	public void UNdisplay() {
		System.out.println("\nDenumirea universitatii : " + this.UNname);
		System.out.println("Anul de fondare : " + this.UNfoundationYear);
		System.out.println("Studentii :\n" + this.Student);		
	}

	public String toString() {
		return (STname + " " + STage + " " + STmark);
	}
}

