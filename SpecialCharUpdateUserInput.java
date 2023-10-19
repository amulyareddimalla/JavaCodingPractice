/* Updating Special Character from User Input*/

package PracticeQuestions;

import java.util.Scanner;

public class SpecialCharUpdateUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("User Input: " +str);
	
	    System.out.print(printDifferentSpeicalCharacter("Updated output: " +str));
	    }

	    private static String printDifferentSpeicalCharacter(String str)
	    {
	        return str.replace('a', '*');
	    }
	}
	