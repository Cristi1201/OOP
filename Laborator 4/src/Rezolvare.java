import java.util.Stack;

public class Rezolvare {
	public static void evaluate(String expression) {
		char[] tokens = expression.toCharArray();

		Stack<Integer> values = new Stack<Integer>();
		Stack<Character> ops = new Stack<Character>();

		for (int i = 0; i < tokens.length; i++) {

			if (tokens[i] == ' ')
				continue;

			if (tokens[i] >= '0' && tokens[i] <= '9') {
				StringBuffer sbuf = new StringBuffer();

				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
					sbuf.append(tokens[i++]);

				values.push(Integer.parseInt(sbuf.toString()));

				i--;
			}

			else if (tokens[i] == '(')
				ops.push(tokens[i]);

			else if (tokens[i] == ')') {
				while (ops.peek() != '(')
					values.push(applyOp(ops.pop(), values.pop(), values.pop()));
				ops.pop();
			}

			else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {

				while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
					values.push(applyOp(ops.pop(), values.pop(), values.pop()));

				ops.push(tokens[i]);
			}
		}

		while (!ops.empty())
			values.push(applyOp(ops.pop(), values.pop(), values.pop()));

		System.out.println(values.pop());
	}

	public static boolean hasPrecedence(char op1, char op2) {
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}

	public static int applyOp(char op, int b, int a) {
		switch (op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new UnsupportedOperationException("Cannot divide by zero");
			return a / b;
		}
		return 0;
	}
}





//	// exercitiu primit din main
//	private static char[] exercitiu; 
//	// rezultatul returnat
////	private static double rezultat;	
//	// stiva pentru memorarea parantezelor
//	private static Stack<Character> paranteza = new Stack<Character>();	
//	
//	/// ------------------- *** ------------------ ///
//	public static boolean rezolvare(String exercitiu) {
//		Rezolvare.exercitiu = exercitiu.toCharArray();
//		// stergerea spatiilor albe daca sunt
//				for (int i=0; i<Rezolvare.exercitiu.length; i++)
//					if (Rezolvare.exercitiu[i] == ' ') 
//						for (int j=i; j<exercitiu.length(); j++)
//							Rezolvare.exercitiu[i] = Rezolvare.exercitiu[i+1];
//		return Rezolvare.noParenthesis();
//	}
//	
//	/// ------------------- *** ------------------ ///
//	private static boolean noParenthesis() {
//		boolean suntParanteze = true;
//		while (suntParanteze) {
//			suntParanteze = false;
//			for (int indexEx=0; indexEx<Rezolvare.exercitiu.length; indexEx++) {
//				if (Rezolvare.exercitiu[indexEx] == '{' || Rezolvare.exercitiu[indexEx] == '[' || Rezolvare.exercitiu[indexEx] == '(') {
//					Rezolvare.paranteza.add(Rezolvare.exercitiu[indexEx]);
//				}
//				if (Rezolvare.exercitiu[indexEx] == '}' || Rezolvare.exercitiu[indexEx] == ']' || Rezolvare.exercitiu[indexEx] == ')') {
//					if (Rezolvare.paranteza.isEmpty())	return false;
//					if (Rezolvare.exercitiu[indexEx] != (char) Rezolvare.paranteza.peek()+1 &&
//						Rezolvare.exercitiu[indexEx] != (char) Rezolvare.paranteza.peek()+2) 
//						return false;
//					Rezolvare.paranteza.pop();
//				}
//			}
//		}
//		if (Rezolvare.paranteza.isEmpty()) {
//			return true;
//		}
//		return false;
//	}

//	
//	/// ------------------- *** ------------------ ///
//	private static float solve(int indexStart, int indexEnd) {
//		// indexStart = 0
//		// indexEnd = Rezolvare.exercitiu.length
//		
//		char op1 = '*', op2 = '/';
//		for (int operatoriIerarhici = 0; operatoriIerarhici<2; operatoriIerarhici++) {
//			for (int i = 1; i<Rezolvare.exercitiu.length; i++) {
//				if (Rezolvare.exercitiu[i] == op1 || Rezolvare.exercitiu[i] == op2) {
//					int indexBfOp = i - 1;
//					int indexAfOp = i + 1;
//					//verificare daca trebuie de rezolvat sau e doar semn (la inceput de array)
//					if (indexBfOp == -1) {
//						break;
//					}
//					char[] nr = new char[1000];
//					int indexnr=0;
//					System.out.println("indexBfOp : " + indexBfOp);
//					while (Rezolvare.exercitiu[indexBfOp] != '*' && 
//						   Rezolvare.exercitiu[indexBfOp] != '/' &&
//						   Rezolvare.exercitiu[indexBfOp] != '+' && 
//						   Rezolvare.exercitiu[indexBfOp] != '-' &&
//						   Rezolvare.exercitiu[indexBfOp] >=0) {
//						nr[indexnr] = Rezolvare.exercitiu[indexBfOp];
//						indexnr ++;
//						indexBfOp --;
//					}
//					float nrBfOp = transformToNr(nr);
//					
//					nr = new char[1000];
//					indexnr = 0;
//					
//					while (Rezolvare.exercitiu[indexAfOp] != '*' && 
//						   Rezolvare.exercitiu[indexAfOp] != '/' &&
//						   Rezolvare.exercitiu[indexAfOp] != '+' && 
//						   Rezolvare.exercitiu[indexAfOp] < Rezolvare.exercitiu.length) {
//							nr[indexnr] = Rezolvare.exercitiu[indexBfOp];
//							indexnr ++;
//							indexBfOp --;
//							if (Rezolvare.exercitiu[indexAfOp+1] == '-') {
//								break;
//							}
//						}
//					char aux;
//					for (int ii=0; ii<nr.length/2; ii++) {
//						aux = nr[nr.length-ii-1];
//						nr[nr.length-ii-1] = nr[ii];
//						nr[ii] = aux;
//					}
//					
//					float nrAfOp = transformToNr(nr);
//					float rez;
//					rez = op1 == '*' ?
//							nrBfOp * nrAfOp :
//							nrBfOp + nrAfOp;
//					rez = op1 == '/' ?
//							nrBfOp / nrAfOp :
//							nrBfOp - nrAfOp;
//					
//					return rez;
//				}
//			}
//			op1 = '+';
//			op2 = '-';
//		}	
//		return 0;
//	}
//	
//
//	private static float transformToNr(char[] chrs) {
//		float nrResult = 0f;
//		int i = chrs.length-1;
//		boolean nrFloat = false;
//		
//		while (i >= 0) {
//			if (chrs[i] == '.')	nrFloat = true;
//			
//			if (!nrFloat) nrResult *= 10 + (int) chrs[i]-48;
//			else nrResult += (0.1 * (int) chrs[i]-48);
//			
//			i --;
//		}
//		return nrResult;
//	}

//		float rezultat;
//		
//		/* se parcurge caracterele de 2 ori:
//		 * operator = 0 ---> se opereaza la semnele * si /
//		 * operator = 1 ---> se opereaza la semnele + si -
//		 */ 
//		char op1 = '*', op2 = '/';	
//		double result=0;
//		// se itereaza pe '*' si '/' , apoi pe '+' si '-'
//		for (int operator=0; operator<2; operator++) { 
//			for (int ch=indexStart; ch<indexEnd; ch++) {
//				if (exercitiu[ch] == op1 || exercitiu[ch] == op2) {
//					int i = ch-1;
//					String number = "";
//					while ((exercitiu[i] != '*' && exercitiu[i] != '/' && exercitiu[i] != '+' && exercitiu[i] != '-' && i > 0) &&
//						  ((exercitiu[i] >= 48 && exercitiu[i] <= 57) || exercitiu[i] == '.')) {
//						number += exercitiu[i];
//						i --;
//					}
//					int indexNumberStart = i+1; // unde trebuie de pus primul nr
//					double nrLeft = toNumeric(number);
//					
//					i = ch+1;
//					number = "";
//					while ((exercitiu[i] != '*' && exercitiu[i] != '/' && exercitiu[i] != '+' && exercitiu[i] != '-' && i < exercitiu.length-1) &&
//						  ((exercitiu[i] >= 48 && exercitiu[i] <= 57) || exercitiu[i] == '.')) {
//						number += exercitiu[i];
//						i ++;
//					}
//					int indexNumberEnd = -- i;	// unde trebuie sa se sfarseasca primul nr
//					double nrRight = toNumeric(number);
//					
//					
//					if (exercitiu[ch] == op1) {
//						result = op1 == '*' ? nrLeft * nrRight:
//									 	      nrLeft + nrRight;
//					}
//					else {
//						result = op1 == '/' ? nrLeft / nrRight:
//									 	      nrLeft - nrRight;
//					}
////					int[] resultArr;
////					int ii = 0;
////					while (result != 0) {
////						
////					}
//				}
//				
//				
//			}
//			op1 = '+'; op2 = '-';
//		}
//		
//		return result;
//	}

//	private static double toNumeric(String nrString) {
//		float nrResult = 0;
//		char[] nrChar = nrString.toCharArray();
//		int i = nrChar.length-1;
//		while (nrChar.length > 0) {
//			if (nrChar[i] != '.')
//				nrResult *= 10 + (int) nrChar[i]-48;
//			else 
//				nrResult += (0.1 * (int) nrChar[i]-48);
//			i --;
//		}
//		return nrResult;
//	}
//}
