package PracticeQuestions;

public class RemoveWhiteSpaces {

		    public static void main(String[] args) {
		        String str = "  This is        A m    ul  ya         ";
		        System.out.print(removeWhiteSpace(str));
		    }

		    private static String removeWhiteSpace(String str) {
		        String newStr = str.replaceAll("\\s", "");
		        return newStr;
		    }
		

}
