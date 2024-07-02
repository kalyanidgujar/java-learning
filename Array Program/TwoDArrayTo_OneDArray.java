//WAJP convert 2D array into 1D array
import java.util.*;
class TwoDArrayTo_OneDArray
{
	public static void main(String[] args) {
		int[][] twoDArray = {{ 1, 2, 3 },{ 4, 5, 6 }, { 7, 8, 9 }};

        // Calculate the total number of elements in the 2D array

        int totalElements = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            totalElements += twoDArray[i].length;
        }

        // Create a 1D array with the same total number of elements
        int[] oneDArray = new int[totalElements];

        // Copy elements from 2D array to 1D array
        int index = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                oneDArray[index++] = twoDArray[i][j];
            }
        }

        // Print the original 2D array
        System.out.println("Original 2D Array:"+Arrays.deepToString(twoDArray));

        // Print the converted 1D array
        System.out.println("\nConverted 1D Array:"+Arrays.toString(oneDArray));
    }
	}
