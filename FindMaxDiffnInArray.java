package PracticeQuestions;

//To find the Maximum Difference in an Array as User Input
import java.util.Scanner;

public class FindMaxDiffnInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [] arr = {10,90,2,40,1,25};
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
		        printMaximumDifference(arr);
		    }

		    private static void printMaximumDifference(int [] arr)
		    {
		        //Approach find greatest and smallest number in java and then subtract it.
		        int max = arr[0];
		        int min = arr[0];

		        for(int i=0; i<arr.length; i++)
		        {
		            if(arr[i] > max)
		            {
		                max = arr[i];
		            }

		            else if (arr[i] < min)
		            {
		                min = arr[i];
		            }
		        }

		        System.out.print("Max Difference is: "+ (max-min));
		    }

	}

