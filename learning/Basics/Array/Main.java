import java.util.Scanner;

public class Main{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter tge elements of array you want: ");
    int n = sc.nextInt();

    int nums[] = new int[n];
    int sum = 0;

    System.out.println("Enter elements in array");

    for(int i=0;i<n;i++){
      System.out.print("#"+i+" : ");
      nums[i] = sc.nextInt();
      sum += nums[i];
    }

    
    // for(int i=0;i<n;i++){
    //  // System.out.print(nums[i]+" ");
    // }

    System.out.println("Sum of all elements : "+sum);
  }
}