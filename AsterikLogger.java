package week5Assignment;

public class AsterikLogger implements Logger{

	//public static String A(String wordPassedIn) {
		//	String thisIsAPlaceHolder = ("***Error: " + wordPassedIn + "***");
			//return thisIsAPlaceHolder;
	//}
	
	@Override
	public void log(String log) {
	
		System.out.println("***" + log.toString() + "***");
	}


	@Override
	public void error(String error) {
		
		System.out.println("***ERROR:" + error.toString() + "***");
	}
	
	
	//public static String log(String word) {
			//String newWord = ("***Error: " + word + "***");
			//return newWord;
}
