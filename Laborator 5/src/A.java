//public class A {
//	
//	private String a;
//	
//	public A(String a) {
//		this.a = a;
//	}
//	
//	public void print() {
//		System.out.println(this.a);
//	}
//}

public class A {

	protected String a;
	protected X x = new X("ceva");

	public A(String a, X x) {
		this.a = a;
		this.x = x;
	}

	public String getA() {
		return a + "\n" + x.getX();
	}
}
