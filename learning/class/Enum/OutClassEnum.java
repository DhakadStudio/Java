enum Difficulty{
      LOW,
      MEDIUM,
      HIGH
}

public class OutClassEnum{

  public static void main(String[] args){
    Difficulty diff = Difficulty.LOW;

    for(Difficulty d:Difficulty.values()){
      System.out.println(d);
    }
    
    switch(diff){
      case LOW -> System.out.println("Low Level");
      case MEDIUM -> System.out.println("Medium Level");
      case HIGH -> System.out.println("High Level");
    }
  }
}