import java.util.HashSet;

public class Car{

  public static void main(String[] args){

    HashSet<String> cars = new HashSet<>();

    cars.add("BMW");
    cars.add("Volvo");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");

    // if(cars.contains("BMW")){
    //   System.out.println("It contains BMW");
    // }

    // cars.remove("BMW");

    // if(cars.contains("BMW")){
    //   System.out.println("It contains BMW");
    // }

    // cars.clear();

    // System.out.println(cars.size());
    // System.out.println(cars);

    for(String car:cars){
      System.out.print(car+"  ");
    }
    System.out.println();
  }
}