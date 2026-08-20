import java.util.HashMap;
import java.util.Map;

public class Main{

  public static void main(String[] args){
    //HashMap<String,String> capitalCities = new HashMap<>();
    //Map<String,String> capitalCities = new HashMap<>();
    var capitalCities = new HashMap<String,String>();
    
    capitalCities.put("India","New Delhi");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("England", "London");
    capitalCities.put("India","New Delhi"); //Duplicate
    capitalCities.put("Norway", "Oslo");

    capitalCities.remove("England");
    
    print(capitalCities);
    printValues(capitalCities);

    System.out.println(capitalCities.size());

    capitalCities.clear();
    
    print(capitalCities);
    
  }

  static void print(Map<String,String> map){
    for(String key: map.keySet()){
      System.out.println(key+": "+map.get(key));
    }
  }

  static void printValues(Map<String,String> map){
    for(String value:map.values()){
      System.out.print(value+"  ");
    }
    System.out.println();
  }
}