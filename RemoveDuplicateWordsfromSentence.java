package PracticeQuestions;

import java.util.HashSet;

public class RemoveDuplicateWordsfromSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        String str = "Hello I am Amulya Hello I";
		        printSentenceWithoutDuplicates(str);
		    }

		    private static void printSentenceWithoutDuplicates(String str) {
		        String[] strSplit = str.split("\\s");
		        HashSet<String> uniqueWords = new HashSet<>();

		        for (String word : strSplit) {
		            if (uniqueWords.add(word)) {
		                System.out.print(word + " ");
		            }
		        }
		    }
		}


