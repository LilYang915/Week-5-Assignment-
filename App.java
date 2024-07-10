package week5Assignment;

public class App implements Logger{

	public static void main(String[] args) { 
		
		
	
Logger logger = new AsterikLogger();
logger.log("Hello");

Logger logger1 = new SpaceLogger();
logger1.log("Hello");

Logger logger2 = new AsterikLogger();
logger2.error("Hello");

Logger logger3 = new SpaceLogger();
logger3.error("Hello");





	
	}

	
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
	}


}