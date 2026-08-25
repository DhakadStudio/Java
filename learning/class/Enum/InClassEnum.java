
public class InClassEnum{

  enum Difficulty{
      LOW,
      MEDIUM,
      HIGH
    }
  
  public static void main(String[] args){
    Difficulty diff = Difficulty.LOW;

    switch(diff){
      case LOW -> System.out.println("Low Level");
      case MEDIUM -> System.out.println("Medium Level");
      case HIGH -> System.out.println("High Level");
    }
    
  }
}