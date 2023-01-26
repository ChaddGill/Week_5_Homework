package javaweek5;

public class HomeworkApp extends AsteriskLogger{
	
	public static void main(String[] args) {
		
		Logger log = new AsteriskLogger();
		
		log.log("Hello");
		System.out.println();
		
		log.error("Greetings!");
		System.out.println();
		
		log.log("Stay safe out there!");
		System.out.println();
		
		log.error("Have a safe night!");
		System.out.println();
		
		
		
		
		spacedLogger secondLog = new spacedLogger();
		
		secondLog.log("Hello World");
		System.out.println();
		System.out.println("__________________________________________________");
		System.out.println();
		
		
		secondLog.error("How was your day?");
		System.out.println();
		System.out.println("__________________________________________________");
		System.out.println();
		
		
		secondLog.log("Have a great weekend!");
		System.out.println();
		System.out.println("__________________________________________________");
		System.out.println();
		
		
		secondLog.error("Stay warm out there!");
		System.out.println();
		System.out.println("__________________________________________________");
		System.out.println();
		
		
	}

}
