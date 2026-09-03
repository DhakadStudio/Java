package com.expensetracker;

import com.expensetracker.model.Category;
import com.expensetracker.service.ExpenseService;
import com.expensetracker.uitl.DateUtil;
import java.util.Scanner;
import java.time.LocalDate;

public class Main{

  static Scanner sc = new Scanner(System.in);
  static ExpenseService expenseService = new ExpenseService();
  
  public static void main(String[] args){

    

    // while(true){
      
    // }
    
  }

  static void addExpense(){
    String description = getDescription();
    Double amount = getAmount();
    Category category = getCategory();

    if(category == null){
      category = Category.OTHER;
    }

    if(description != null && amount != null){
      expenseService.addExpense(amount,description,category);
    } else{
      System.out.println("Can't add expense!" );
    }
  }

  static void updateAll(){
    Integer id = getId();
    String description = getDescription();
    Double amount = getAmount();
    Category category = getCategory();

    if(id == null){
      System.out.println("Id can't be null");
      return;
    }
    
    if(description != null && amount != null){
      expenseService.update(id,amount,description,category);
    } else {
      System.out.println("There is error in update!");
    }
    
  }

  static void updateDescription(){
    Integer id = getId();
    String description = getDescription();
    
    if(id == null){
      System.out.println("Id can't be null");
      return;
    } 
    
    if(description != null){
      expenseService.update(id,null,description,null);
    } else {
      System.out.println("There is error in update!");
    }
  }

  static void updateAmount(){
    Integer id = getId();
    Double amount = getAmount();

    if(id == null){
      System.out.println("Id can't be null");
      return;
    } 
    
    if(amount != null){
      expenseService.update(id,amount,null,null);
    } else {
      System.out.println("There is error in update!");
    }
    
  }

  static void updateCategory(){
    Integer id = getId();
    Category category = getCategory();

    if(id == null){
      System.out.println("Id can't be null");
      return;
    }
    
    if(category != null){
      expenseService.update(id,null,null,category);
    } else {
      System.out.println("There is error in update!");
    }
  }

  static String getDescription(){ 
    try{
      System.out.print("Enter Description: ");
      String description = sc.nextLine();
      return description;
    } 
    catch(Exception e){
      System.out.println("There is error in Description taking!");
    }
    return null;
  }

  static Category getCategory(){
    try{
      System.out.println("  Category List  ");
      for(Category c:Category.values()){
        System.out.println("• "+c);
      }
      System.out.print("Enter Category: ");
      Category category = Category.valueOf(sc.nextLine().toUpperCase().trim());
      return category;
    } catch(Exception e){
      return null;
    }
  }

  static Double getAmount(){
    try{
      System.out.print("Enter Amount: ");
      double amount = sc.nextDouble();
      return amount;
    } catch(Exception e){
      System.out.println("Error in amount taking");
    }
    return null;
  }

  static Integer getId(){
    try{
      System.out.print("Enter Id: ");
      int id = sc.nextInt();
      return id;
    } catch(Exception e){
      System.out.println("Error in Id taking");
    }
    return null;
  }

  static LocalDate getDate(){
    try{
      System.out.print("Enter Year: ");
      int year = sc.nextInt();
      System.out.print("Enter Month: ");
      int month = sc.nextInt();
      System.out.print("Enter Day: ");
      int day = sc.nextInt();

      LocalDate date = LocalDate.parse(day+"-"+month+"-"+year,DateUtil.FORMATTER)
    }
  }
  
}