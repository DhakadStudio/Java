import java.util.Scanner;

public class NoOfWord{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine().trim();

        int count=0;
        
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' ' && text.charAt(i-1)!=' '){
                count++;
            }
        }
        count++;
        System.out.println(count);
    }
}