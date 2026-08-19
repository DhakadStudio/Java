import java.util.Set;
import java.util.TreeSet;

public class Main{

  public static void main(String[] args){

    Set<Integer> oddNums = new TreeSet<>();
    var evenNums = new TreeSet<Integer>();

    evenNums.add(10);
    evenNums.add(8);
    evenNums.add(6);
    evenNums.add(4);
    evenNums.add(2);
    
    oddNums.add(9);
    oddNums.add(7);
    oddNums.add(5);
    oddNums.add(3);
    oddNums.add(1);
    
    System.out.println(oddNums);
    System.out.println(evenNums);
  }
}