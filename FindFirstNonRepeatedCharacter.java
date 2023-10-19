package PracticeQuestions;

/* Find 1st Non-Repeated Character from User Input*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FindFirstNonRepeatedCharacter {

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
			String str=sc.next();
			char output = findNonRepeatingCharacter(str);
	        if (output == '\0') {
	            System.out.println("No non-repeated character found.");
	        } 
	        else {
	            System.out.println("First non-repeated character: " + output);
	        }
	        
	    }

	    private static char findNonRepeatingCharacter(String str) {
	        Map<Character, Integer> charCount = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }

	        for (char c : str.toCharArray()) {
	            if (charCount.get(c) == 1) {
	                return c;
	            }
	        }

	        return '\0'; // If no non-repeated character is found.
	    }
	}


