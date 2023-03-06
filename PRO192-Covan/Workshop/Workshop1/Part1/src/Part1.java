

import java.util.Scanner;



/**
 *
 * @author LENOVO
 */


public class Part1 {
    public static void main(String[] args) {
        int row;
        int col;
        int matrix[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row(s): ");
        row = sc.nextInt();
        System.out.println("Enter the number of collum(s)");
        col = sc.nextInt();
        matrix = new int[row][col];
        System.out.println("Enter the matrix:");
        for(int i = 0; i < row; i++){
             for(int j = 0; j < col; j++){
                System.out.print("\nm["+i+"]["+j+"] = ");
                matrix[i][j] = sc.nextInt();
            }         
        }
        System.out.println("Matrix inputted: ");
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
        }
        int sum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (float)sum / (row * col));
    }
    

    
}
