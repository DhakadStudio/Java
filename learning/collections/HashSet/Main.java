import java.util.Set;
import java.util.HashSet;

public class Main{

  public static void main(String[] args){

    //Set<Integer> nums = new HashSet<>();
    
    var nums = new HashSet<Integer>();

    nums.add(7);
    nums.add(6);
    nums.add(9);
    nums.add(3);

    for(int i=1; i<10;i++){
      if(nums.contains(i)){
        System.out.println(i+" is part of the set.");
      } else {
        System.out.println(i+" is not part of tge set.");
      }
    }

  }
}