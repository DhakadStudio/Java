package com.expensetracker;

import com.expensetracker.model.Category;
import com.expensetracker.service.ExpenseService;
import com.expensetracker.util.DateUtil;
import java.util.Scanner;
import java.time.LocalDate;

public class Main{

  static Scanner sc = new Scanner(System.in);
  static ExpenseService expenseService = new ExpenseService();
  
  public static void main(String[] args){
    
    System.out.println("*********************");
    System.out.println(" * Expense Tracker * ");
    System.out.println("*********************");
    
    while(true){
      printMenu();
      System.out.print("Choose an option: ");
      int choose;

      try{
        choose = sc.nextInt();
        sc.nextLine();
        
      } catch(Exception e){
        System.out.println("Invalid Choose");
        sc.nextLine();
        continue;
      }

      if(choose==0){
        break;
      }

      switch(choose){
        case 1: addExpense();
          break;
        case 2: expenseService.displayAllexpenses();
          break;
        case 3: editMenu();
          break;
        case 4: removeExpense();
          break;
        case 5: search();
          break;
        case 6: filterCategory();
          break;
        case 7: montlyTotal();
          break;
        case 8: sortByAmount();
          break;
        case 9: sortByDate();
          break;
        case 10: expenseService.categorySummary();
          break;
        default: System.out.println("Invalid Input!");
      }
    }
    
    sc.close();
  }

  static void printMenu(){
    System.out.println("*********************");
    System.out.println("    Menu");
    System.out.println("1. Add Expense");
    System.out.println("2. View Expenses");
    System.out.println("3. Edit Expense");
    System.out.println("4. Remove Expense");
    System.out.println("5. Search Expense");
    System.out.println("6. Filter by Category");
    System.out.println("7. Monthly Total");
    System.out.println("8. Sort by Amount");
    System.out.println("9. Sort by Date");
    System.out.println("10. Category Summary");
    System.out.println("0. Exit");
  }

  static void editMenu(){
    System.out.println("*********************");
    System.out.println("   Edit Menu");
    System.out.println("1. Edit Description");
    System.out.println("2. Edit Category");
    System.out.println("3. Edit Amount");
    System.out.println("4. Edit Date");
    System.out.println("5. Edit All");
    System.out.println("0. Cancel");

    System.out.print("Choose an option: ");
    int choose;
    
    try{
        choose = sc.nextInt();
        sc.nextLine();
        
    } 
    catch(Exception e){
        System.out.println("Invalid Choose");
        sc.nextLine();
        return;
    }

    switch(choose){
      case 0 -> System.out.print("");
      case 1 -> updateDescription();
      case 2 -> updateCategory();
      case 3 -> updateAmount();
      case 4 -> updateDate();
      case 5 -> updateAll();
        default -> System.out.println("Invalid Input!");
    }
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
    LocalDate date = getDate();

    if(id == null){
      System.out.println("Id can't be null");
      return;
    }
    
    if(description != null && amount != null ){
      expenseService.update(id,amount,description,category,date);
    } else {
      System.out.println("There is error in update!");
    }
    
  }

  static void updateDate(){
    Integer id = getId();
    LocalDate date = getDate();
    
    if(id == null){
      System.out.println("Id can't be null");
      return;
    } 
    
    if(date != null){
      expenseService.update(id,null,null,null,date);
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
      expenseService.update(id,null,description,null,null);
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
      expenseService.update(id,amount,null,null,null);
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
      expenseService.update(id,null,null,category,null);
    } else {
      System.out.println("There is error in update!");
    }
  }

  static void removeExpense(){
    Integer id = getId();
    
    if(id != null){
      expenseService.removeExpense(id);
    } else {
      System.out.println("There is error in delete!");
    }
  }

  static void search(){
    try{
      System.out.print("Enter Keyword: ");
      String keyword = sc.nextLine().toLowerCase();
      expenseService.search(keyword);
    }catch(Exception e){
      System.out.println("Error in keyword taking");
    }
  }

  static void filterCategory(){
    Category category = getCategory();

    if(category == null){
      System.out.println("Invalid Category!");
      return;
    }

    expenseService.filterByCategory(category);
  }

  static void montlyTotal(){
    try{
      System.out.print("Enter Year: ");
      int year = sc.nextInt();
      System.out.print("Enter Month: ");
      int month = sc.nextInt();
      sc.nextLine();

      double totalAmount = expenseService.getMonthlyTotal(month,year);

      System.out.printf("Total Expense for %d/%d: ₹%.2f\n",month,year,totalAmount);
    } 
    catch(Exception e){
      System.out.println("Error in input of date!");
      sc.nextLine();
    }
  }

  static void sortByAmount(){
    System.out.println("========== SORT BY AMOUNT ==========");
    System.out.println("1. Low → High");
    System.out.println("2. High → Low");
    System.out.println("0. Cancel");
    System.out.print("Choose: ");
    try{
      int choose = sc.nextInt();
      if(choose==1 || choose==2){
        expenseService.sortByAmount(choose);
      }else if(choose==0){
        return;
      }else{
        System.out.println("Invalid input!");
      }
    }catch(Exception e){
      System.out.println("Invalid input!");
      sc.nextLine();
    }
  }

  static void sortByDate(){
    System.out.println("========== SORT BY DATE ==========");
    System.out.println("1. Newest → Oldest");
    System.out.println("2. Oldest → Newest");
    System.out.println("0. Cancel");
    System.out.print("Choose: ");
    try{
      int choose = sc.nextInt();
      if(choose==1 || choose==2){
        expenseService.sortByDate(choose);
      }else if(choose==0){
        return;
      }else{
        System.out.println("Invalid input!");
      }
    }catch(Exception e){
      System.out.println("Invalid input!");
      sc.nextLine();
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
      String input = sc.nextLine();
      Category category = Category.valueOf(input.toUpperCase().trim());
      return category;
    } catch(Exception e){
      return null;
    }
  }

  static Double getAmount(){
    try{
      System.out.print("Enter Amount: ");
      double amount = sc.nextDouble();
      sc.nextLine();
      return amount;
    } catch(Exception e){
      System.out.println("Error in amount taking");
      sc.nextLine();
    }
    return null;
  }

  static Integer getId(){
    try{
      System.out.print("Enter Id: ");
      int id = sc.nextInt();
      sc.nextLine();
      return id;
    } catch(Exception e){
      System.out.println("Error in Id taking");
      sc.nextLine();
    }
    return null;
  }

  static LocalDate getDate(){
    try{
        System.out.print("Enter Date (dd-MM-yyyy): ");

        String input = sc.nextLine();

        return LocalDate.parse(input, DateUtil.FORMATTER);

    } catch(Exception e){
        System.out.println("Invalid date! Use dd-MM-yyyy.");
    }

    return null;
  }
  
    
  }