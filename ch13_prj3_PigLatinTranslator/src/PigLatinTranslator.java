
public class PigLatinTranslator {

	private String englishInput;
	private String[] words;
	private String pigLatinOutput;
	
	public PigLatinTranslator(String englishInput) {
		this.englishInput = englishInput;
	}

	public String getEnglishInput() {
		return englishInput;
	}

	public void setEnglishInput(String englishInput) {
		this.englishInput = englishInput;
	}

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public String getPigLatinOutput() {
		return pigLatinOutput;
	}

	public void setPigLatinOutput(String pigLatinOutput) {
		this.pigLatinOutput = pigLatinOutput;
	}
	
	public String translate() {
		convertToLowercase();
		parseStringToArray();
		removePunctuation();
		
		// words is now 'clean' and ready for translation
		// 1) if word starts with a vowel, add 'way' to the end
		// 2) If the word starts with a consonant, move all of the 
		//     consonants that appear before the first vowel 
		//     to the end of the word, then add ay to the end 
		//     of the word
		// 3) If a word starts with the letter y, the y should
		//    be treated as a consonant. If the y appears anywhere 
		//    else in the word,	it should be treated as a vowel.
		for (String s: words) {
			if (startsWithVowel(s)) {
				s+="way";
			}
			else if (!startsWithVowel(s)) {
				int i = s.indexOf(ch)
			}
		}
		return pigLatinOutput;
	}
	
	private int indexOfFirstVowel(String s) {
		int i = 0;
		//TODO start here!
		//for ()
		if (s.startsWith("a") || s.startsWith("e") || 
				s.startsWith("i") || s.startsWith("o") || 
				s.startsWith("u")) {
		}
		
		return i;
	}
	private boolean startsWithVowel(String s) {
		boolean startsWithVowel = false;
		if (s.startsWith("a") || s.startsWith("e") || 
				s.startsWith("i") || s.startsWith("o") || 
				s.startsWith("u")) {
			startsWithVowel = true;
		}
		return startsWithVowel;
	}
	
	private void convertToLowercase() {
		englishInput = englishInput.toLowerCase();
	}
	
	private void parseStringToArray() {
		words = englishInput.split(" ");
	}
	
	private void removePunctuation() {
		for (String s: words) {
			// remove ',' '.' '!' and '?' from end of each word
			if (s.endsWith(",")||s.endsWith(".")|| 
					s.endsWith("!")|| s.endsWith("?")) {
				int l = s.length();
				s = s.substring(0,l-1);
			}
		}
	}
	
	
	
	
	
}
