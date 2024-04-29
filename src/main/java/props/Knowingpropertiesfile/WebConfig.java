package props.Knowingpropertiesfile;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class WebConfig {
	private String randomlyChosenWord = null;
	private String[] randomWords = { "father", "mother", "sister", "flag", "tree", "man", "child" };
	Random random = new Random();
	private char[] allchar;

	public WebConfig() {
		randomlyChosenWord = randomWords[random.nextInt(randomWords.length)];
		System.out.println("Random words is:" + randomlyChosenWord);
		allchar = new char[randomlyChosenWord.length()];
	}

	public String toString() {
//    	System.out.println(randomWords.length);
//    	return randomWords[random.nextInt(randomWords.length)];
		String rept = "";
		for (char c : allchar) {
			if (c == '\u0000') {
				rept = rept + "_";
			} else {
				rept += c;
			}
			rept = rept + ' ';
		}
		return rept;
	}

	public boolean addGuess(char guessedChar) {
		boolean isGuessCorrect = false;
		for (int i = 0; i < randomlyChosenWord.length(); i++) {
			if (guessedChar == randomlyChosenWord.charAt(i)) {
				allchar[i] = guessedChar;
				isGuessCorrect=true;
			}
		}
		return isGuessCorrect;

	}
}
