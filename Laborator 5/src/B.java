//public class B extends A{
//	
//	private String b;
//
//	public B(String b) {
//		super(b);
//		this.b = b;
//	}
//}

public class B extends A {

	protected String b;

	public B(String a, X x, String b) {
		super(a, x);
		this.b = b;

	}

	public String getB() {
		return b + "\n" + getA();
	}
}
