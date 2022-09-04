package JavaPrograms;

public class NumberOfOccuranceOfWordsInASentence {

	public static void main(String[] args) {
		String sentence = "hai how are you this is suhas hai this is ravi i am doing good how about you";
		String[] splittedsentences = sentence.split(" ");
		String SearchingWord = "how";
		
//		System.out.println(splittedsentences[0]);
		int count = 0;
		for(int i=0;i<splittedsentences.length;i++) {
			if(SearchingWord.equals(splittedsentences[i])) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("words are repeated for"+count);
		}else {
			System.out.println("words are not repeated ");
		}
		
	}

}
