/*
 addition of two matrix.
 Name = monika memane
 Date = 17-10-22
 */
package add_matrix;
import java.util.Scanner;
public class addition {
	 public static void main(String[] args) {
	        int rows = 2;
	        int	columns = 3;
	        int[][] firstMatrix = {{12,3,1}, {6,4,9}};
	        int[][] secondMatrix = {{-4,4,3}, {1,4,6}};

	        // Adding Two matrices
	        int[][] sum = new int[rows][columns];
	        for(int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	            sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
	            }
	        }

	        // Displaying the result
	        System.out.println("Sum of two matrices is: ");
	        for(int[] row : sum) {
	            for (int column : row) {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	        }
	    }
	}
	