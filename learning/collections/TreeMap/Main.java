import java.util.TreeMap;
import java.util.Map;

public class Main{

  public static void main(String[] args){
    
   // TreeMap<Integer,String> student = new TreeMap<>();
   // Map<Integer,String> student = new TreeMap<>();
   var student = new TreeMap<Integer,String>();

    
    student.put(2,"Siddharth");
    student.put(1,"Vishal");
    student.put(4,"Ishan");
    student.put(3,"Devesh");
    student.put(5,"Harsh");

    student.remove(5);

    System.out.println(student.size());
    
    print(student);
    printValues(student);

    student.clear();
    
    print(student);
  }

  static void print(Map<Integer,String> map){
    for(int i:map.keySet()){
      System.out.println(i+": "+map.get(i));
    }
  }

  static void printValues(Map<Integer,String> map){
    for(String name:map.values()){
      System.out.print(name+"  ");
    }
    System.out.println();
  }
  
}