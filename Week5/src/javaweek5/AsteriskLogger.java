package javaweek5;

public class AsteriskLogger implements Logger {
	
// implemented method
	public void log(String log) {
		System.out.println("***" + log + "***");
	}
	
	public void error(String error) {
		
		System.out.println("************" + "*".repeat(error.length()));
		System.out.println("***ERROR:" + error + "***");
		System.out.println("************" + "*".repeat(error.length()));
	}

}
