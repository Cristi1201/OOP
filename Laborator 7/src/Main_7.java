import java.util.ArrayList;

/**
 * Laborator 7 POO
 * 
 * @author Cristi
 *
 */
public class Main_7 {

	public static void main(String[] args) {
		Cub cub = new Cub(4);
		Sphere sphere = new Sphere(1.8);
		Parallelepiped pr = new Parallelepiped(2.1, 3.4, 1.9);

		ArrayList<GeometricBody> objects = new ArrayList<GeometricBody>();
		objects.add(cub);
		objects.add(sphere);
		objects.add(pr);

		for (GeometricBody obj : objects) {
			System.out.printf("\nSurface : %.2f\n", obj.getSurface());
			System.out.printf("Volume  : %.2f\n", obj.getVolume());
		}

		System.out.println("\nBiggest volume  : " + GeometricBodyController.getBiggestVolume(objects));
		System.out.println("Biggest surface : " + GeometricBodyController.getBiggestSurface(objects));
	}	

}

//
////Abstract class
//abstract class Animal { // Abstract method
//	public abstract void eyeColor(); // Regular method
//
//} // Subclass (inherit from Animal)
//
//class Pig extends Animal {
//
//	public void eyeColor() { //implementation of parent abstract method is given here 
//		System.out.println("Eye color is black"); }
//	}
//
//class Main_7 { 
//	public static void main(String[] args) { 
//		Pig pig = new Pig(); // Create a Truck object 
//		pig.eyeColor(); 
//		
//		
//		
////		pig.favoriteFood();
////		pig.sound();
//	}
//}
