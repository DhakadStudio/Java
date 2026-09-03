import java.util.Scanner;

public class SumOnCondition{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    
    int numbers[] = new int[n];

    System.out.println("Enter elements in array");

    for(int i=0;i<n;i++){
      System.out.print("#"+(i+1)+" : ");
      numbers[i] = sc.nextInt();
    }

    int sumEven=0;
    int sumOdd=0;

    for(int i=0;i<n;i++){
      if(numbers[i]%2 ==0){
        sumEven += numbers[i];
      } else {
        sumOdd += numbers[i];
      }
    }

    System.out.println();
    System.out.println("Sum of Odd: "+sumOdd);
    System.out.println("Sum of Even: "+sumEven);
  }
}