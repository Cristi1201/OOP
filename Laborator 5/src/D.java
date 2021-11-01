//public class D extends C{
//	
//	private String d;
//	
//	public D(String d) {
//		super(d);
//		this.d = d;
//	}
//}

public class D extends C {

	protected String d;
	protected X x = new X("altceva");

	public D(String a, X x, String b, String c, String d) {
		super(a, x, b, c);
		this.d = d;
	}

	public String getD() {
		return d + "\n" + getC();
	}
}
