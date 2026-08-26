import java.io.FileInputStream;
import java.io.IOException;

public class FInputStream{

  public static void main(String[] args){

    try(FileInputStream reader = new FileInputStream("Text.txt")){
      byte i;

      while((i= (byte) reader.read()) != -1){
        System.out.print((char)i);
      }

      System.out.println();
    } catch(IOException e){
      System.out.println("Something went wrong!");
    }
    
  }
}