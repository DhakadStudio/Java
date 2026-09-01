import java.util.Scanner;


public class StarPattern{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number: ");

    int n = sc.nextInt();
    // hollow Triangle
    for(int i=1; i<=n ;i++){
      for(int j=1; j<=i; j++){
        if(j==1 || j==i || i==n){
        System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }


    for(int i=1; i<=n ;i++){
      for(int j=1; j<=i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    
  }
}