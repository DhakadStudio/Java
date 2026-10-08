import java.util.Scanner;

public class Frequency{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.print("Enter the char to find Frequency: ");
        char c = sc.next().charAt(0);

        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }

        System.out.println("Frequency of "+c+" in "+str+" is: "+count);
    }
}