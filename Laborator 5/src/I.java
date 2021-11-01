//public class I extends H{
//	
//	private String i;
//	
//	public I(String i) {
//		super(i);
//		this.i = i;
//	}
//}

public class I extends H {

	protected String i;

	public I(String a, X x, String b, String c, String d, String e, String f, String g, String h, String i) {
		super(a, x, b, c, d, e, f, g, h);
		this.i = i;
	}

	public String getI() {
		return i + "\n" + getH();
	}
}