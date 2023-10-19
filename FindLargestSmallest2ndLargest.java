package PracticeQuestions;

/* Find Largest, Smallest & 2nd Largest from User Input Array*/

import java.util.Scanner;

public class FindLargestSmallest2ndLargest {

	    public static void main (String[] args)
	    {
//	        int [] arr = {23,5,1,89,65,0,23,432,1};
	    	  Scanner scanner = new Scanner(System.in);
	          System.out.print("Enter the number of elements in the array: ");
	          int n = scanner.nextInt();

	          int[] arr = new int[n];
	          System.out.println("Enter the elements of the array:");
	          for (int i = 0; i < n; i++) {
	              arr[i] = scanner.nextInt();
	          }
	        printLargest2ndLargestAndSmallest(arr);
	    }

	    private static void printLargest2ndLargestAndSmallest(int [] arr)
	    {
	        int lengthOfArray = arr.length;
	        int largest = arr[0];
	        int smallest = arr[0];
	        int secondLargest = arr[0];

	        for(int i=0; i<lengthOfArray; i++)
	        {
	            if(arr[i]>largest)
	            {
	                secondLargest = largest;
	                largest = arr[i];
	            }

	            else if (arr[i] < smallest)
	            {
	                smallest = arr[i];
	            }

	        }

	        System.out.print(largest+" "+secondLargest+" "+" "+smallest);
	    }

	}


