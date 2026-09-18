import java.util.Scanner;

public class Transpose{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of rows: ");
    int rows = sc.nextInt();

    System.out.print("Enter the no. of columns: ");
    int cols = sc.nextInt();

    int[][] matrix = new int[rows][cols];
    int[][] transpose = new int[cols][rows];

    System.out.println("Enter the elements of  matrix: ");

    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        System.out.print("#"+(i+1)+" #"+(j+1)+": ");
        matrix[i][j] = sc.nextInt();
      }
    }

    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        transpose[j][i] = matrix[i][j];
      }
    }

    System.out.println("Matrix: ");

    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        System.out.print(matrix[i][j]+ "  ");
      }
      System.out.println();
    }

    System.out.println("Transpose: ");
    for(int i=0; i<cols; i++){
      for(int j=0; j<rows; j++){
        System.out.print(transpose[i][j]+ "  ");
      }
      System.out.println();
    }

  }
}