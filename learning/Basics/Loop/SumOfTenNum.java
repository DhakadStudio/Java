//write a java program fpr finding the sum of 10 number using for loop

import java.util.Scanner;

public class SumOfTenNum{

  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of number you want to do sum: ");

    int n = sc.nextInt();

    int sum =0;
    for(int i=1;i<=n;i++){
      System.out.print("Enter #"+i+" num for sum: ");
      sum += sc.nextInt();
    }


    System.out.println("The sum of numbers is "+sum);
    
  } 
}