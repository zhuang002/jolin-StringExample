import java.util.Arrays;
import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please input a text to test:");
		String line=sc.nextLine();
		
		// the properties of String
		System.out.println("The length of the text is: "+line.length());
		
		System.out.print("The text contains chars: ");
		for (int i=0;i<line.length();i++) {
			System.out.print(line.charAt(i)+",");
		}
		System.out.println();
		
		String[] words=line.split(" ");
		System.out.println("The text contains "+words.length+" words. They are:");
		/* for (int i=0;i<words.length;i++) {
			System.out.print(words[i]+",");
		}*/
		for (String word:words) {
			System.out.print(word+",");
		}
		System.out.println();
		
		// substrings
		System.out.print("Please input 2 integers as index:");
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println("The substring before start is: "+ line.substring(0,start));
		System.out.println("The substring between start and end is : "+line.substring(start,end));
		System.out.println("The substring after end is :"+line.substring(end));
		
		sc.nextLine(); // absorb the new line characters.
		
		System.out.println("Pleae input a substring to find in the test string:");
		String  s=sc.nextLine();
		
		// search String
		int idx=line.indexOf(s);
		int lastIdx=line.lastIndexOf(s);
		System.out.println("The index of substring from beginning is "+idx+", from ending is :"+lastIdx);
		
		
		// compare/order string
		System.out.println("Please input 2 strings seperated by new line:");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		/*if (s1.equals(s2)) {
			System.out.println("The two strings are equal.");
		} else {
			System.out.println("The two strings are unequal.");
		}*/
		String equal=(s1.equalsIgnoreCase(s2))?"equal":"unequal";
		System.out.println("The two strings are "+equal+" when ignore cases.");
		
		int compare=s1.compareTo(s2);
		if (compare < 0) {
			System.out.println("s1 is before s2");
		} else if (compare>0) {
			System.out.println("s1 is after s2");
		} else
			System.out.println("s1 and s2 are same");
		
		
		Arrays.sort(words);
		System.out.print(words);
		
		//transform string
		System.out.println("Text to lower case:");
		System.out.println(line.toLowerCase());
		
		System.out.println("Text to upper case:");
		System.out.println(line.toUpperCase());
		
		// identify string
		
		s="";
		while (!s.equals("quit")) {
			System.out.print("Please input a word:");
			s=sc.nextLine();
			if (s.isBlank()) System.out.print("'"+s+"' is blank");
			else if (isNumeric1(s)) System.out.print("'"+s+"' is numeric");
		}
		
	}

	private static boolean isNumeric1(String s) {
		for (int i=0;i<s.length();i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isInteger(String s) {
		try {
			int a=Integer.parseInt(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	private static boolean isDouble(String s) {
		try {
			double a=Double.parseDouble(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	private static boolean isNumeric(String s) {
		return isDouble(s);
	}

}
