package longestWord;

public class LongestWord {
	public static String findLongestWord(String input) {
		String words[]=input.split("\\s+");
		String longestWord="";
		
		for(String word:words) {
			if(word.length()>longestWord.length()) {
				longestWord=word;
			}
		}
		return longestWord;		
	}
	
	
	
	//Test
	public static void main(String[] args) {
		String input1="dummy text of the printing and typesetting industry";
		String longestWord1=findLongestWord(input1);
		System.out.println("Longest word in 1st sentence: "+longestWord1);
		
		String input2="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using 'Content here, content here', making it look like readable English";
		String longestWord2=findLongestWord(input2);
		System.out.println("Longest word in 2nd sentence: "+longestWord2);
		
	}
	

}
