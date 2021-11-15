import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Main_8 extends JFrame implements ActionListener {

	private static void verify13(double nr) throws UnluckyException {
		if (nr == 13) {
			throw new UnluckyException("Nenorocos ...");
		}
	}

	// verificare ca input-ul sa fie numar
	private static boolean isNumber(String str) {

		boolean decimalValue = false;

		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				continue;
			}
			if (ch == '.' && decimalValue == false) {
				decimalValue = true;
			} else {
				return false;
			}
		}
		return true;
	}

	JButton btnDivide;
	JTextField input1, input2;
	JLabel txt1, txt2, txtrez, rez, errorInput;

	Main_8() {
		txt1 = new JLabel("1 numar");
		txt1.setBounds(90, 50, 150, 30);
		add(txt1);
		input1 = new JTextField();
		input1.setBounds(150, 50, 150, 30);
		add(input1);

		txt2 = new JLabel("2 numar");
		txt2.setBounds(90, 80, 150, 30);
		add(txt2);
		input2 = new JTextField();
		input2.setBounds(150, 80, 150, 30);
		add(input2);

		txtrez = new JLabel("Raspuns :");
		txtrez.setBounds(90, 140, 150, 30);
		add(txtrez);
		rez = new JLabel("");
		rez.setBounds(150, 140, 150, 30);
		add(rez);

		errorInput = new JLabel("");
		errorInput.setBounds(150, 140, 230, 30);
		errorInput.setForeground(Color.red);
		add(errorInput);

		btnDivide = new JButton("/");
		btnDivide.setBounds(90, 200, 100, 30);
		add(btnDivide);

		btnDivide.addActionListener(this);

		setLayout(null);
		setSize(600, 400);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ev) {
		double nr1 = 0;
		double nr2 = 0;
		double c = 0;

		if (String.valueOf(input1.getText()).length() == 0 || String.valueOf(input2.getText()).length() == 0) {
			rez.setText("");
			errorInput.setText("Toate campurile trebuiesc completate.");
			return;
		}

		if (isNumber(input1.getText()) && isNumber(input2.getText())) {
			nr1 = Double.parseDouble(input1.getText());
			nr2 = Double.parseDouble(input2.getText());
			if (nr2 == 0) {
				rez.setText("");
				errorInput.setText("Impartirea la 0 (zero) nu se efectueaza.");
				return;
			}
		} else {
			rez.setText("");
			errorInput.setText("Ati introdus gresit. Revizuiti.");
			return;
		}

		try {
			verify13(nr2);
		} catch (UnluckyException ex) {
			rez.setText("");
			errorInput.setText("" + ex);
			return;
		}

		if (ev.getSource().equals(btnDivide)) {
			c = nr1 / nr2;
			c = Math.round(c * 100.0) / 100.0;
			errorInput.setText("");
			rez.setText(String.valueOf(c));
		}
	}

	public static void main(String args[]) {
		Main_8 t = new Main_8();
	}
}

//class InvalidAgeException  extends Exception  
//{  
//    public InvalidAgeException (String str)  
//    {  
//        // calling the constructor of parent Exception  
//        super(str);  
//    }  
//}  
//    
//// class that uses custom exception InvalidAgeException  
//public class Main_8  
//{  
//  
//    // method to check the age  
//    static void validate (int age) throws InvalidAgeException{    
//       if(age < 18){  
//  
//        // throw an object of user defined exception  
//        throw new InvalidAgeException("age is not valid to vote");    
//    }  
//       else {   
//        System.out.println("welcome to vote");   
//        }   
//     }    
//  
//    // main method  
//    public static void main(String args[])  
//    {  
//        try  
//        {  
//            // calling the method   
//            validate(19);  
//        }  
//        catch (InvalidAgeException ex)  
//        {  
//            System.out.println("Caught the exception");  
//    
//            // printing the message from InvalidAgeException object  
//            System.out.println("Exception occured: " + ex);  
//        }  
//  
//        System.out.println("rest of the code...");    
//    }  
//}  
