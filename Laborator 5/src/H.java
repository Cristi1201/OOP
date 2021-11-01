//public class H extends G{
//	
//	private String h;
//	
//	public H(String h) {
//		super(h);
//		this.h = h;
//	}
//}

public class H extends G {

	protected String h;
	private X x = new X("cu totul altceva");

	public H(String a, X x, String b, String c, String d, String e, String f, String g, String h) {
		super(a, x, b, c, d, e, f, g);
		this.h = h;
	}

	public String getH() {
		return h + "\n" + getG();
	}
}