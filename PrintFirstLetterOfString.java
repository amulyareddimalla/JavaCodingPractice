package PracticeQuestions;

public class PrintFirstLetterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "I am Amulya";
		        returnFirstAlphabet(str);
		    }

		    private static void returnFirstAlphabet(String string) {
		        String[] split = string.split(" ");
		        for (String word : split) {
		            System.out.print(word.charAt(0));
		        }
		    }
		}

	
