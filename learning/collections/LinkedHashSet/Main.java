import java.util.LinkedHashSet;
import java.util.Set;

public class Main{

  public static void main(String[] args){
    LinkedHashSet<Integer> nums = new LinkedHashSet<>();
    Set<Integer> even = new LinkedHashSet<>();
    var odd = new LinkedHashSet<Integer>();

    for(int i=1;i<=10;i++){
      nums.add(i);
      if(i%2==0){
        even.add(i);
      } else {
        odd.add(i);
      }
    }

    // for(int i=0;i<=10;i++){
    //   if(even.contains(i)){
    //     System.out.println(i+ " is even number");
    //   }
    //   if(odd.contains(i)){
    //     System.out.println(i+ " is odd number");
    //   }
    // }

    nums.remove(10);
    nums.remove(9);
    even.remove(10);
    odd.remove(9);

    System.out.println(nums.size()==even.size()+odd.size());
   
    print(nums);
    print(even);
    print(odd);

    nums.clear();
    print(nums);
  }

  static void print(Set<Integer> set){
    for( int i: set){
      System.out.print(i+" ");
    }
    System.out.println();
  }
}