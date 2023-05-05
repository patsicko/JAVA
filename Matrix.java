// MANIBAHO Patrick
// Reg: 22/17741
// Assignment OOP with java

import java.util.Random;

public class Matrix {

    public static void main(String[] args) {

        int[][] matrix = new int[7][7];
        Random random = new Random();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
       System.out.println("Original matrix:  ");
       printMatrix(matrix);
        // Response 1.a: 7x7 matrix with main diagonal formed by largest numbers in each column
        System.out.println("1.a: Response 1.a: 7x7 matrix with main diagonal formed by largest numbers in each column");
        for (int j = 0; j < cols; j++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxIndex = i;
                }
            }
            matrix[j][j] = max;
            if (maxIndex != j) {
                matrix[maxIndex][j] = matrix[j][j];
                matrix[j][maxIndex] = max;
            }
        }
        printMatrix(matrix);

        // Response 1.b: 7x7 matrix with main diagonal formed by largest numbers in each row
        System.out.println("1.b: Response 1.b: 7x7 matrix with main diagonal formed by largest numbers in each row");
        for (int row = 0; row < rows; row++) {
            int max = Integer.MIN_VALUE;
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                }
            }
            matrix[row][row] = max;
        }
        printMatrix(matrix);

        // Response 2.a: 7x7 matrix with opposite diagonal formed by smallest numbers in each column
        System.out.println("2.a:Response 2.a: 7x7 matrix with opposite diagonal formed by smallest numbers in each column");
        for (int row = 0; row < rows; row++) {
            int min = Integer.MAX_VALUE;
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
            }
            matrix[row][cols - row - 1] = min;
        }
        printMatrix(matrix);

        // Response 2.b: 7x7 matrix with opposite diagonal formed by smallest numbers in each row
        System.out.println("2.b:Response 2.b: 7x7 matrix with opposite diagonal formed by smallest numbers in each row");
        for (int col = 0; col < cols; col++) {
            int min = Integer.MAX_VALUE;
            for (int row = 0; row < rows; row++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
            }
            matrix[rows - col - 1][col] = min;
        }
        printMatrix(matrix);
    }

    //  method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

