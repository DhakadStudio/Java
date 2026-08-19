public class Task{

  private int id;
  private String title;
  private boolean completed = false;

  Task(int id, String title){
    this.id = id;
    this.title = title;
  }

  void changeIdTo(int id){
    this.id = id;
  }

  void isCompleted(){
    this.completed = true;
  }

  @Override
  public String toString(){
    return (this.completed?" ⬤ ":" ◯ ")+this.id+". "+this.title;
  }
  
}