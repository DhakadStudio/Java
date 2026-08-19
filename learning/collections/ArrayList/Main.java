import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{

  public static void main(String[] args){

    var symbols = new ArrayList<Character>();
    //List<Character> symbols = new ArrayList<>();
    //ArrayList<Character> symbols = new ArrayList<>();

    symbols.add('@');
    symbols.add('%');
    symbols.add('#');
    symbols.add('*');
    
    symbols.add(0,'₹');  //(index,value)

    // symbols.remove(2);

    // System.out.println(symbols.get(2));

    // symbols.set(2,'∆'); //(index,value)

    // for(int i=0;i<symbols.size();i++){
    //   System.out.println(symbols.get(i));
    // }

    // for(char symbol:symbols){
    //   System.out.println(symbol);
    // }
    // symbols.clear();

    System.out.println(symbols);
    
    Collections.sort(symbols);

    System.out.println(symbols);

    
  }
}