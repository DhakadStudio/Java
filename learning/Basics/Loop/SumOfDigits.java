import java.util.Scanner;


class SumOfDigits{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Vishal Dhakad");
    System.out.print("Enter the number: ");

    int n = sc.nextInt();

    int sum = 0;

    for(;n>0;n /= 10){
      int digit = n%10;
      sum += digit;
    }

    System.out.println("Sum of Digits is: "+sum);
  }
}


