package TechnicalTest;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {

	public static void main (String args []) {
	
		
	 System.out.println("post codes below will display false for invalid post code or true for valid post codes");
		
	 ArrayList<String> pc = new ArrayList<String>();
	
		
		pc.add("$%± ()()");
		pc.add("XX XXX");
		pc.add("A1 9A");
		pc.add("LS44PL");
		pc.add("Q1A 9AA");
		pc.add("V1A 9AA");
		pc.add("X1A 9BB");
		pc.add("LI10 3QP");
		pc.add("LJ10 3QP");
		pc.add("LZ10 3QP");
		pc.add("A9Q 9AA");
		pc.add("AA9C 9AA");
		pc.add("FY10 4PL");
		pc.add("SO1 4QQ");
		pc.add("EC1A 1BB");
		pc.add("W1A 0AX");
		pc.add("M1 1AE");
		pc.add("B33 8TH");
		pc.add("CR2 6XH");
		pc.add("DN55 1PT");
		pc.add("GIR 0AA");
		pc.add("SO10 9AA");
		pc.add("FY9 9AA");
		pc.add("WC1A 9AA");
		
		final String regex = "^([A-PR-UWYZ](([0-9](([0-9]|[A-HJKSTUW])?)?)|([A-HK-Y][0-9]([0-9]|[ABEHMNPRVWXY])?)) ?[0-9][ABD-HJLNP-UW-Z]{2})$";
	
		Pattern pattern = Pattern.compile(regex);
	 
		for (String postcode : pc)
		{
		    Matcher m = pattern.matcher(postcode);
		    System.out.println(m.matches());
		}
	}
}
