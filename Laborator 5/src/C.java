//public class C extends B{
//	
//	private String c;
//	
//	public C(String c) {
//		super(c);
//		this.c = c;
//	}
//}

public class C extends B {

	protected String c;

	public C(String a, X x, String b, String c) {
		super(a, x, b);
		this.c = c;
	}

	public String getC() {
		return c + "\n" + getB();
	}

}
