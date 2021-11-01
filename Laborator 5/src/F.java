//public class F extends E{
//	
//	private String f;
//	
//	public F(String f) {
//		super(f);
//		this.f = f;
//	}
//}

public class F extends E {

	protected String f;

	public F(String a, X x, String b, String c, String d, String e, String f) {
		super(a, x, b, c, d, e);
		this.f = f;
	}

	public String getF() {
		return f + "\n" + getE();
	}
}
