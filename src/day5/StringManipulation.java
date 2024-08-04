package day5;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "Welcome";
		String s2 = new String("Welcome");

		int length = s2.length();
		System.out.println("The length is:  " + length);
		
		System.out.println(s.length());
		
		
		String s1 = "Welcome";
		String s3 = " to Java";
		String s4 = " programming";
		System.out.println(s1 + s3);
		System.out.println(s1.concat(s3).concat(s4));
		
		
		s = "    welcome to java   ";
		
		System.out.println(s.length());
		s.trim();
		System.out.println(s.length());
		
		s = "Java Selenium";
		System.out.println(s.charAt(length));
		
		s = "Java Selenium";
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(5));
		
		//contains()-- returns a boolean (true/false)
		//check a string is the part of the main string or not
		
		System.out.println(s.contains("Jav"));
		System.out.println(s.contains("Sel"));
		System.out.println(s.contains("ium"));
		System.out.println(s.contains("Sli"));
		System.out.println(s.contains("a S"));
		
		//equals(), equalsIgnoreCase() --> compare two string and returns true/false
		s1 = "Welcome";
		s2 = "Welcome";
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equalsIgnoreCase(s2));

		//replace()- it replaces a single character or character sequence of a given string
		s= "welcome to java selenium automation";
		
		System.out.println(s.replace("w", "W"));
		System.out.println(s.replace("java", "python"));
		
		//substring(0 -- extracts substring from the main string
		
		System.out.println(s.substring(11));
		System.out.println(s.substring(11, 15));
		// toUpperCase() toLowerCase() --> converts cases
		s = "Welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toUpperCase());
		
		//split() -- split or divide original string into multiple parts based on delimiter
		s = "abc@xyz";
		
		String a[] = s.split("@");
		System.out.println(a[1]);
		
		s = "welcome to java selenium automation";
		String b[] = s.split(" ");
		System.out.println(b[3]);
		
		s = "welcome to java selenium automation";
		System.out.println(s.replace(" ", "_"));
		
		s = "abc,123@m.com";
		String[] c = s.split(",");
		System.out.println(c[0]);
		
	
		}

}
