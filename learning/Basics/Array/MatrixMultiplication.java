import java.util.Scanner;

public class MatrixMultiplication{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the no. rows and column: ");
    int n = sc.nextInt();

    int[][] mult = new int[n][n];
    int[][] matrix1 = new int[n][n];
    int[][] matrix2 = new int[n][n];

    System.out.println("Enter the elements of 1st matrix: ");
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        System.out.print("#"+(i+1)+" #"+(j+1)+": ");
        matrix1[i][j] = sc.nextInt();
      }
    }
    
    System.out.println("Enter the elements of 2nd matrix: ");
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        System.out.print("#"+(i+1)+" #"+(j+1)+": ");
        matrix2[i][j] = sc.nextInt();
      }
    }

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        for(int k=0; k<n; k++){
          mult[i][j]  += matrix1[i][k] * matrix2[k][j];
        }
      }
    }

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
         System.out.print(mult[i][j]+"  ");
      }
      System.out.println();
    }
  }
}