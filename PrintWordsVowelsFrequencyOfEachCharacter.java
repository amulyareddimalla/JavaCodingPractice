package PracticeQuestions;

import java.util.HashMap;
import java.util.Map;


public class PrintWordsVowelsFrequencyOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "Amulya is Learning";
		        printAllCharacters(str);
		    }

		    private static void printAllCharacters(String str) {
		        //WordCount
		        String[] words = str.split(" ");
		        System.out.println("Word count: " + words.length);

		        //Print Vowels
		        int vowelCount = 0;
		        String vowels = "aeiouAEIOU";
		        for (char ch : str.toCharArray()) {
		            if (vowels.contains(String.valueOf(ch))) {
		                vowelCount++;
		            }
		        }
		        System.out.println("Vowel count is: " + vowelCount);

		        //Frequency of each character
		        Map<Character, Integer> freqMap = new HashMap<>();
		        for (char ch : str.toCharArray()) {
		            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		        }

		        //Printing map
		        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
		            System.out.println("Character: " + entry.getKey() + " Frequency: " + entry.getValue());
		        }
		    }
		

}
