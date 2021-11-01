//public class E extends D{
//	
//	private String e;
//	
//	public E(String e) {
//		super(e);
//		this.e = e;
//	}
//}

public class E extends D {

	protected String e;

	public E(String a, X x, String b, String c, String d, String e) {
		super(a, x, b, c, d);
		this.e = e;
	}

	public String getE() {
		return e + "\n" + getD();
	}
}