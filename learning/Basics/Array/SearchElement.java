import java.util.Scanner;

public class SearchElement{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the element to Found: ");
    int value = sc.nextInt();

    int arr[] ={10,20,30,40,50,60,70,80,90,100};
    boolean isFound = false;

    for(int i=0;i<arr.length;i++){
      if(arr[i]==value){
        System.out.println("Element is found at index #"+ i);
        isFound=true;
        break;
      }
    }

    if(!isFound){
      System.out.println("Element is not found!");
    }
    
  }
}