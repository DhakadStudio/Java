import java.util.Scanner;


public class Reverse{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the elements of array you want: ");
    int n = sc.nextInt();

    int nums[] = new int[n];
    int sum = 0;

    System.out.println("Enter elements in array");

    for(int i=0;i<n;i++){
      System.out.print("#"+i+" : ");
      nums[i] = sc.nextInt();
      sum += nums[i];
    }

    for(int i=n-1;i>=0;i--){
      System.out.println(nums[i]+" ");
    }

    System.out.println();
  }
}