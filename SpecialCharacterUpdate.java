/* Updating Special Character in a string*/
package PracticeQuestions;

public class SpecialCharacterUpdate
{
    public static void main (String[] args)
    {
        
    	String str = "Amulya@Star";

        System.out.print(printDifferentSpeicalCharacter(str));
    }

    private static String printDifferentSpeicalCharacter(String str)
    {
        return str.replace('@', '*');
    }
}

