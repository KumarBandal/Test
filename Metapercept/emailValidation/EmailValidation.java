package emailValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	public static boolean validateEmail(String email) {
		String pattern="^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
		
		Pattern emailPattern=Pattern.compile(pattern);
		
		Matcher matcher=emailPattern.matcher(email);
		
		return matcher.matches();
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an email.....");
		String email=sc.nextLine();
		
		if (validateEmail(email)) {
			System.out.println("Given email is valid");
			}
		else {
			System.out.println("Given email is Invalid");
		}
		
	}

}
