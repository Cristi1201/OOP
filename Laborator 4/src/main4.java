import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class main4 {

	public static void main(String[] args) {

		Queue<String> ll = new LinkedList<String>();

		try {
			File file = new File("one_expression.txt"); // creates a new file instance
			FileReader fr = new FileReader(file); // reads the file
			BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
			String line;
			while ((line = br.readLine()) != null) {
				ll.add(line);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		do {
			Rezolvare.evaluate(ll.poll());
		} while (ll.peek() != null);
	}
}

