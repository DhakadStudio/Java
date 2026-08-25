import java.util.LinkedHashMap;
import java.util.Map;

public class Main{

  public static void main(String[] args){
   // LinkedHashMap<Integer,String> students = new LinkedHashMap<>();
    // Map<Integer,String> students = new LinkedHashMap<>();
    var students = new LinkedHashMap<Integer,String>();

    students.put(1,"Vishal");
    students.put(2,"Siddharth");
    students.put(3,"Pradeep");
    students.put(6,"Vishant");
    students.put(4,"Devesh");
    students.put(5,"Ishan");

    students.remove(6);

    System.out.println(students.size());

    
    print(students);
    printValue(students);

    students.clear();
    
    print(students);
  }

  static void print(Map<Integer,String> map){
    for(int i:map.keySet()){
      System.out.println(i+": "+map.get(i));
    }
  }

  static void printValue(Map<Integer,String> map){
    for(String value: map.values()){
      System.out.print(value+"  ");
    }
    System.out.println();
  }
}