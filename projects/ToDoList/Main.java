import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
  
  static Scanner sc = new Scanner(System.in);
  static TaskManager manager = new TaskManager();

  public static void main(String[] args){

    System.out.println("*********************");
    System.out.println(" -=*=- To Do List -=*=- ");
    System.out.println("*********************");

    while(true){
      try{
        printMenu();
        System.out.print("Enter the Task number To perform: ");
        int taskToPerform = sc.nextInt();
        sc.nextLine();

        if(taskToPerform ==0 ){
        break;
        }

        switch(taskToPerform){
          case 1 -> addTask();
          case 2 -> manager.viewTasks();
          case 3 -> markCompleted();
          case 4 -> removeTask();
          default -> System.out.println("invalid number try again!");
        }
      }
      catch(InputMismatchException e){
        System.out.println("Please enter the Task number only");
        System.out.println("    Try Again!   ");
        sc.nextLine();
        continue;
      }
      
    }
    
  }

  static void printMenu(){
    System.out.println(" -=*=-  Menu  -=*=- ");
    System.out.println("0. Exit");
    System.out.println("1. To Add New Task");
    System.out.println("2. View Tasks");
    System.out.println("3. Complete Task");
    System.out.println("4. Remove Task");
    System.out.println("---------****-------\n");
  }

  static void addTask(){
    System.out.println(" -=*=-  -=*=- -=*=- -=*=-");
    System.out.print("Enter the title for the task: ");
    String title = sc.nextLine();
    manager.addTask(title);
    System.out.println("------------***-----------\n");
  }
  
  static void markCompleted(){
    System.out.println(" -=*=-  -=*=- -=*=- -=*=-");
    try{
      System.out.print("Enter the task number to mark complete: ");
      int id = sc.nextInt();
      sc.nextLine();
      manager.taskCompleted(id);
    }
    catch(InputMismatchException e){
      System.out.println("Please enter the Task number only");
      sc.nextLine();
    }
    System.out.println("------------***-----------\n");
  }
  
  static void removeTask(){
    System.out.println(" -=*=-  -=*=- -=*=- -=*=-");
    try{
      System.out.print("Enter the task number to remove: ");
      int id = sc.nextInt();
      sc.nextLine();
      manager.removeTask(id);
    }
    catch(InputMismatchException e){
      System.out.println("Please enter the Task number only");
      sc.nextLine();
    }
    System.out.println("------------***-----------\n");
  }
  
}