package day3;

public class SwitchStatementDoNow {
	public static void main(String[] args) {
		
		determineBrowser("chrome");
	}


	public static void determineBrowser(String browserName) {
		switch(browserName) {
		case "chrome": {
			System.out.println("Use Chrome");
			break;
		}
		case "FireFox": {
			System.out.println("Use Firefox");
			break;
		}
		case "Edge": {
			System.out.println("Use Edge");
			break;

	    }
		default:{
			System.out.println("Just use anything");
			
		}
	    }	

}
}

