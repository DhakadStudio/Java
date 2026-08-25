import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;


class Car{

  String brand;
  String model;
  int year;

  Car(String brand,String model,int year){
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  @Override 
  public String toString(){
    return this.brand+" "+this.model+" "+this.year;
  }
}



class SortByYear implements Comparator{

  public int compare(Object obj1,Object obj2){

    Car a = (Car) obj1;
    Car b = (Car) obj2;

    if(a.year<b.year) return -1;
    if(a.year>b.year) return 1;
    if(a.year==b.year) return 0;
    return 0;
  }
}


public class CarSorting{
  
  public static void main(String[] args){

    ArrayList<Car> myCars = new ArrayList<>();
    myCars.add(new Car("BMW","X5",1999));
    myCars.add(new Car("Honda","Accord",2006));
    myCars.add(new Car("Ford","Mustang",1970));

    Comparator myComparator = new SortByYear();

    Collections.sort(myCars, myComparator);

    for(Car car:myCars){
      System.out.println(car);
    }
  }
}