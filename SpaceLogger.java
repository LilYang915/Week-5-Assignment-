package week5Assignment;

public class SpaceLogger implements Logger {


	@Override
	public void log(String log) { 
		System.out.println(log.replace("", " ").trim());
		
	} 

	@Override
	public void error(String log) {
		System.out.println("ERROR:" +log.replace("", " ").trim());
	}

	

	
}

