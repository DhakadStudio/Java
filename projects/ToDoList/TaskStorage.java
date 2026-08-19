import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskStorage{
  
  private static final String fileName = "tasks.json";
  private Gson gson = new GsonBuilder()
    .setPrettyPrinting()
    .create();

 public void saveTasks(ArrayList<Task> tasks){
   
   try(FileWriter writer = new FileWriter(fileName)){
     gson.toJson(tasks,writer);
   } 
     catch(IOException e){
     System.out.println("Could not save tasks");
   }
   
 }

  public ArrayList<Task> loadTasks(){
    try(FileReader reader = new FileReader(fileName)){
      
      Task[] taskArray = gson.fromJson(reader, Task[].class);

      if (taskArray == null) {
                return new ArrayList<>();
            }

            ArrayList<Task> tasks = new ArrayList<>();

            for (Task task : taskArray) {
                tasks.add(task);
            }
      return tasks;
    }
    catch(IOException e){
      System.out.println("Could not load saved tasks");
    }
    return new ArrayList<Task>();
  }

}