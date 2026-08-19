import java.util.ArrayList;

public class TaskManager{

  private int taskNo = 0;
  private ArrayList<Task> tasks;
  private final TaskStorage taskStorage = new TaskStorage();

  TaskManager(){
    this.tasks = this.taskStorage.loadTasks();
    this.taskNo = tasks.size();
  }

  void saveTask(){
    this.taskStorage.saveTasks(tasks);
  }

  void addTask(String title){
    this.taskNo++;
    this.tasks.add(new Task(this.taskNo, title));
    saveTask();
  }

  void removeTask(int id){
    if(id<1){
      System.out.println("Id must be the positive no.");
    } 
    else if(id<=tasks.size()){
      this.tasks.remove(id-1);

      for(int i=id-1;i<this.tasks.size();i++){
        tasks.get(i).changeIdTo(i+1);
      }
      taskNo--;
      saveTask();
    } else {
      System.out.println("The task number is wrong!");
    }
  }

  void  viewTasks(){
    System.out.println(" -=*=-  -=*=- -=*=- -=*=-");
    for(int i=0; i< tasks.size();i++){
      System.out.println(tasks.get(i));
    }
    System.out.println("------------***-----------\n");
  }

  void taskCompleted(int id){
    if(id<1){
      System.out.println("Id must be the positive no.");
    } else if(id<=tasks.size()){
      this.tasks.get(id-1).isCompleted();
      saveTask();
    } else {
      System.out.println("The task number is wrong!");
    }
  }
  
}