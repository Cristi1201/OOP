package main1_1;

public class Monitor {
	public String color;
	public int dimension_x;
	public int dimension_y;
	public int resolution;

	public Monitor() {	//default constructor
		
	}
	
	public Monitor(String color, int dimension_x, int dimension_y, int resolution) { 	//parameterized constructor
		this.color = color;
		this.dimension_x = dimension_x;
		this.dimension_y = dimension_y;
		this.resolution = resolution;
	}
	
	public void display() {
		System.out.println("1) Culoare        : " + color);
		System.out.println("2.1) Dimensiune x : " + dimension_x);
		System.out.println("2.2) Dimensiune y : " + dimension_y);
		System.out.println("3) Rezolutie      : " + resolution + " px");
	}
	
	public void aaaaa() {
		System.out.println("aiciciciciici");
	}
	
	public void delete_Monitor(Monitor monitor) {
		delete(monitor);
	}
	
	protected void delete(Monitor monitor) {
		monitor = null;
	}
}
