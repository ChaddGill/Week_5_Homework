package javaweek5;

public class spacedLogger {

// convert string to character then print with space
	public void log(String log) {
		
		char[] logChar = log.toCharArray();
		
		for(char a : logChar) {
			System.out.print(a);
			System.out.print(" ");
		}
	}
	
// same but with error in font
	
	public void error(String error) {
		
		System.out.print("Error: ");
		char[] errorChar = error.toCharArray();
		
		for(char b : errorChar) {
			System.out.print(b);
			System.out.print(" ");
		}
	}
}
