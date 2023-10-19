/* Extracting Last 4 characters of a string from User Input*/

package PracticeQuestions;

import java.util.Scanner;

public class ExtractLast4CharcatersofAString {

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
			String str=sc.next();
//	    	String str = "Amulya Learning";
	        printLast4Chars(str);
	    }

	    private static void printLast4Chars(String str) {
	        int size = str.length();
	     // Ensure startIndex is not negative and print even char are <4
	        int startIndex = Math.max(size - 4, 0); 
	        System.out.println(str.substring(startIndex));
	    }
	}


