package PracticeQuestions;

//To find repeating values in an Array as User Input

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FindRepeatingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
		        printRepeatingElements(arr);
		    }

		    private static void printRepeatingElements(int[] arr) {
		        // Create a HashMap to store elements as keys and their counts as values.
		        Map<Integer, Integer> map = new HashMap<>();

		        for (int num : arr) {
		            // Use the compute method to update the count for each element in the map.
		            map.compute(num, (key, value) -> (value == null) ? 1 : value + 1);
		        }

		        // Print the map to see the count of each element.
		        System.out.println(map);

		        // Iterate through the map and print elements with counts greater than 1.
		        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		            if (entry.getValue() > 1) {
		                System.out.println("Repeated Value is: " + entry.getKey() + " No. of times: " + entry.getValue());
		            }
		        }
		    }
	
}
