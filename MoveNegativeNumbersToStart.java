package PracticeQuestions;

//To move negative values of an Array to the start

import java.util.Arrays;

public class MoveNegativeNumbersToStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {-1, 2, 3, -4, -7, 8};
		        moveNegativeNumbersToStart(arr);
		    }

		    private static void moveNegativeNumbersToStart(int[] arr) {
		        int n = arr.length;
		        int j = 0;

		        for (int i = 0; i < n; i++) {
		            if (arr[i] < 0) {
		                if (i != j) {
		                    // Swap negative and non-negative numbers
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		                j++;
		            }
		        }

		        System.out.print(Arrays.toString(arr));
		    }
		
	}

