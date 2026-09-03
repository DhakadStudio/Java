import java.util.Scanner;

public class MinMax{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = sc.nextInt();
    
    int numbers[] = new int[n];

    System.out.println("Enter elements in array");

    for(int i=0;i<n;i++){
      System.out.print("#"+(i+1)+" : ");
      numbers[i] = sc.nextInt();
    }

    int min = numbers[0];
    int max = numbers[0];

    for(int i=0;i<n;i++){
      if(min>numbers[i]){
        min = numbers[i];
      }
      if(max < numbers[i]){
        max = numbers[i];
      }
    }

    System.out.println();
    System.out.println("Max: "+max);
    System.out.println("Min: "+min);
  }
}