import java.util.stream.Stream;
import java.util.Arrays;

public class Main{

  public static void main(String[] args){

    int[] nums = {5,8,7,10,1,4,3,6,9,2};

    Arrays.stream(nums).forEach(n->System.out.print(n+" "));

    System.out.println();

    Arrays.stream(nums)
      .filter(n->n%2==0)
      .map(n->n/2)
      .forEach(n->System.out.println(n));

    Arrays.stream(nums)
      .filter(n->n%2==1)
      .map(n->(n+1)/2)
      .forEach(n->System.out.println(n));
  }
}