import java.util.Scanner;

public class MultiDimentional{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the no. of rows: ");
    int rows = sc.nextInt();

    System.out.print("Enter the no. of columns: ");
    int cols = sc.nextInt();

    int[][] matrix1 = new int[rows][cols];
    int[][] matrix2 = new int[rows][cols];
    int[][] sum = new int[rows][cols];
    int[][] multi = new int[rows][cols];

    System.out.println("Enter the elements of 1st matrix: ");

    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        System.out.print("#"+(i+1)+" #"+(j+1)+": ");
        matrix1[i][j] = sc.nextInt();
      }
    }
    
    System.out.println("Enter the elements of 2nd matrix: ");
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        System.out.print("#"+(i+1)+" #"+(j+1)+": ");
        matrix2[i][j] = sc.nextInt();
      }
    }

    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        sum[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }

    System.out.println("sum of matrix is : ");

    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        System.out.print(sum[i][j]+ "  ");
      }
      System.out.println();
    }
  }
}