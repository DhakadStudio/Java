import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Main{
  
  public static void main(String[] args){
    var cars = new LinkedList<String>();

    cars.add("BMW");
    cars.add("Ford");
    cars.add("TaTa");
    cars.add("MarutiSuzuki");

    cars.add(1,"Tesla");

    // System.out.println(cars.get(3));

    // cars.remove(3);
    // cars.remove("BMW");

    // System.out.println(cars);

    // for(String car: cars){
    //   System.out.print(car+" ");
    // }
    // System.out.println();

    // cars.removeFirst();
    // cars.removeLast();
    // cars.addFirst("MarutiSuzuki");
    // cars.addLast("BMW");

    // for(int i=0;i<cars.size();i++){
    //   System.out.print(cars.get(i)+" ");
    // }
    // System.out.println();

    // Collections.sort(cars);

    Collections.sort(cars,Collections.reverseOrder());

    System.out.println(cars);

  //   cars.clear();

  //   System.out.println(cars);
   }
}