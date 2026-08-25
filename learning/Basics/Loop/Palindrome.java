import java.util.Scanner;

public class Palindrome{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Vishal Dhakad");
    System.out.print("Enter the number: ");

    int num = sc.nextInt();
    int orignal = num;
    int reverse=0;

    while(num != 0){
      int digit = num%10;
      reverse = reverse*10+digit;
      num /=10;
    }

    if(orignal == reverse){
      System.out.println("The number is Palindrome!");
    } else {
      System.out.println("The number is not Palindrome!");
    }
    
  }
}