package numberOperation;

public class TestClass {
	public static void main(String[] args) {
		
		InputNumber i=new InputNumber(197,142);
		Multiplication m=new Multiplication();
		int output=m.multiplyLastDigit(i.getNo1(),i.getNo2());
		
		System.out.println("Result= "+output);
	}

}
