package main2_1;

public class box {
	private int height;
	private int width;
	private int depth;
	
	public box() {		// 1. Without parameters (all the instance variables should have default value 1)
		this(1, 1, 1);
	}
	
	public box(int val) {		// 2. With 1 parameter (all the instance variables should have same value)
		this(val, val, val);
	}
	
	public box (int h, int w, int d) {	// 3. With 3 parameters (for each instance variable)
		this.height = h;
		this.width = w;
		this.depth = d;
	}
	
	public void display_box() {
		System.out.println("> Height : " + height);
		System.out.println("> Width  : " + width);
		System.out.println("> Depth  : " + depth);

	}
	
	public int aria() {
		return 2*(this.height*this.width +this.height*this.depth + this.width*this.depth);
	}
	
	public int volum() {
		return this.height*this.width*this.depth;
	}
	
//	public String toString() {
//		return (height + " " + width + " " + depth);
//	}
	
}
