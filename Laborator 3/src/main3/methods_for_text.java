package main3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * clasa respectiva are implimentate urmatoarele metode:
 * 
 * 1) nr_words_sentences - returneaza nr-ul de cuvinte si de propozitii 2) nume
 * - returneaza numarul de litere, vocale si consoane 3) nume - returneaza top5
 * cele mai folosite cuvinte din text si cel mai lung cuvant din text
 * 
 * @author Cristi
 *
 */
public class methods_for_text {

	private String txt = "";

	public methods_for_text(File file) {
		try (FileReader fr = new FileReader(file)) {
			int caracter;
			while ((caracter = fr.read()) != -1)
				this.txt += (char) caracter;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void display_text() {
		System.out.println(this.txt);
	}

	public void nr_words_sentences() {
		System.out.println("\n[+] Primul punct");
		int nr_words = 0, nr_sentences = 0;
		char[] txtch = this.txt.toCharArray();

		for (int i = 0; i < txtch.length - 1; i++) {
			if ((txtch[i] == '.' || txtch[i] == '!' || txtch[i] == '?') && 
			   ((txtch[i + 1] == ' ') || (txtch[i + 1] == '\r') || (txtch[i + 1] == '\n') || (txtch[i + 1] == '\t')))
				nr_sentences++;
			if (txtch[i] == ' ')
				nr_words++;
		}

		nr_sentences++;
		System.out.println(" >  Nr de cuvinte    : " + nr_words);
		System.out.println(" >  Nr de propozitii : " + nr_sentences);
	}

	public void nr_letters_vowels_consonants() {
		System.out.println("\n[+] Al 2-lea punct");
		int nr_vowels = 0, nr_consonants = 0;
		char[] txtch = this.txt.toCharArray();
		for (int i = 0; i < txtch.length; i++) {
			if (txtch[i] >= 101 & txtch[i] <= 132) {
				if (txtch[i] == 'a' || txtch[i] == 'e' || txtch[i] == 'u' || txtch[i] == 'i' || txtch[i] == 'o'
						|| txtch[i] == 'A' || txtch[i] == 'E' || txtch[i] == 'U' || txtch[i] == 'I'
						|| txtch[i] == 'O') {
					nr_vowels++;
				} else
					nr_consonants++;
			}
		}

		System.out.println(" >  Nr vocale   : " + nr_vowels);
		System.out.println(" >  Nr consoane : " + nr_consonants);
		System.out.println(" >  Nr litere   : " + (nr_vowels + nr_consonants));
	}

	public void top5_longest() {
		System.out.println("\n[+] Al 3-lea punct");
		HashMap<String, Integer> HashMap_word = new HashMap<String, Integer>();
		String txtclone = this.txt;
		String[] words = txtclone.split("\\s+"); // sentence.split("\\s+"); // splits by whitespace
		for (String word : words) {
			word = word.toLowerCase();
			if (HashMap_word.containsKey(word)) {
				int x = HashMap_word.get(word);
				HashMap_word.replace(word, ++x);
			} else {
				HashMap_word.put(word, 1);
			}
		}

		int lengthWord = 0;
		String maxLengthWord = new String();
		for (Entry<String, Integer> entry : HashMap_word.entrySet()) { // Iterate through HashMap
			if (lengthWord < entry.getKey().length()) {
				maxLengthWord = entry.getKey();
				lengthWord = entry.getKey().length();
			}
		}
		System.out.println(" >  Cel mai lung cuvant e : \"" + maxLengthWord + "\";");

		for (int top5 = 0; top5 < 5; top5++) {
			int maxValueInMap = (Collections.max(HashMap_word.values())); // This will return max value in the HashMap
			for (Entry<String, Integer> entry : HashMap_word.entrySet()) { // Iterate through HashMap
				if (entry.getValue() == maxValueInMap) {
					System.out.println("\"" + entry.getKey() + "\"" + " se repeta de " + maxValueInMap + " ori;");
					HashMap_word.remove(entry.getKey());
					break;
				}
			}
		}
	}
}
