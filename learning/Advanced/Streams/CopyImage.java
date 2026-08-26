import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyImage{

  public static void main(String[] args){

    try(FileInputStream reader = new FileInputStream("img.jpg");
        FileOutputStream writer = new FileOutputStream("copy.jpg")){
          int i;
          while((i=reader.read()) != -1){
            writer.write(i);
          }
      
        } catch(IOException e) {
          System.out.println("Somethong went wrong!");
        }
  }
}