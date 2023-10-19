package PracticeQuestions;

public class RemoveAllSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "Hello^^%#$(!)_+ A@m&uLy@a";
		        System.out.print(removeSpecialCharacters(str));
		    }

		    private static String removeSpecialCharacters(String str) {
		        // Use a regular expression to remove all special characters
		        String newStr = str.replaceAll("[^a-zA-Z0-9\\s]", "");
		        return newStr;
		    }
		}

	
