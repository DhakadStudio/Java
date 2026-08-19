import java.util.TreeSet;

public class Country{

  public static void main(String[] args){

    TreeSet<String> countries = new TreeSet<>();

    countries.add("India");
    countries.add("Japan");
    countries.add("Russia");
    countries.add("Chaina");
    countries.add("India");
    countries.add("USA");
    countries.remove("Chaina");

    // if(countries.contains("India")){
    //   System.out.println("India is in the set");
    // }

    // countries.clear();

    // System.out.println(countries.size());

    for(String country:countries){
      System.out.print(country+"  ");
    }
    System.out.println();
    
    // System.out.println(countries);
  }
}