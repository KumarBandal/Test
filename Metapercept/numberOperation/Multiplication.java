package numberOperation;

public class Multiplication {
	
	public int multiplyLastDigit(int number1,int number2) {
		
		LastDigitFetcher ldf=new LastDigitFetcher();
		
		int lastDigit1=ldf.getLastDigit(number1);
		int lastDigit2=ldf.getLastDigit(number2);
		
		return lastDigit1*lastDigit2;
		
	}
	

}
