import java.util.Scanner;

public class PalindromeStr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String to check: ");
        String inputStr = sc.nextLine();

        String reverseStr = "";

        for(int i=inputStr.length()-1;i>=0;i--){
            reverseStr += inputStr.charAt(i);
        }

        if(inputStr.equals(reverseStr)){
            System.out.println(inputStr+" is Palindrome");
        }else{
            System.out.println(inputStr+" is not Palindrome");
            
        }
    }
}