package main1_3;

public class university {
	private String UNname;
	private int UNfoundationYear;
	
	private Student[] s; 
	
	
	public university(String UNname, int UNfoundationYear, Student[] s) {
		this.UNname = UNname;
		this.UNfoundationYear = UNfoundationYear;
		this.s = s;
	}
		
	public void UNdisplay() {
		System.out.println("\nDenumirea universitatii : " + this.UNname);
		System.out.println("Anul de fondare : " + this.UNfoundationYear);
		for (Student a: s) {
			System.out.println(a.getSTname() + "; " + a.getSTage() + " ani; " + " media : " + a.getSTmark());
		}
	}

}

