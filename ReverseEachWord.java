package PracticeQuestions;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        String str = "Hello World";
		        printEachWordReverse(str);
		    }

		    private static void printEachWordReverse(String str) {
		        String[] words = str.split(" ");

		        for (String word : words) {
		            for (int i = word.length() - 1; i >= 0; i--) {
		                System.out.print(word.charAt(i));
		            }
		            System.out.print(" ");
		        }
		    }
	

}
