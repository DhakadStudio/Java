package com.expensetracker.service;

import com.expensetracker.repository.ExpenseRepository;
import com.expensetracker.model.Expense;
import com.expensetracker.model.Category;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Comparator;
import java.time.LocalDate;
import java.util.stream.Stream;

public class ExpenseService{

  ArrayList<Expense> expenses ;
  private final ExpenseRepository repository = new ExpenseRepository();

  public ExpenseService() {
  
      try {
        List<Expense> expenseList = repository.load();
        expenses = new ArrayList<>(expenseList);
      } catch (Exception e) {
          expenses = new ArrayList<>();
      }
  }

  public void addExpense(double amount, String description, Category category){
    this.expenses.add(new Expense(amount, description, category));

    repository.save(expenses);
    System.out.println("Expense added successfully.");
  }

  public void update(int id, Double amount, String description,Category category, LocalDate date){
    
    for(Expense expense:expenses){
      if(expense.getId() == id){
        if(amount != null){
          expense.setAmount(amount);
        }
        if(description != null){
          expense.setDescription(description);
        }
        if(category != null){
          expense.setCategory(category);
        }
        if(date != null){
          expense.setDate(date);
        }
        repository.save(expenses);
        return;
      }
    }
    System.out.println("Did find the expense Id"+id);
  }

  public void displayAllexpenses(){
    System.out.println();
    System.out.println("*********************");
    for(Expense expense:this.expenses){
      System.out.println(expense+"\n");
    }
  }
  
  public void removeExpense(int id){
    boolean removed = false;
    for(int i=0;i<this.expenses.size();i++){
      if(expenses.get(i).getId() == id){
        expenses.remove(i);
        repository.save(expenses);
        removed = true;
        break;
      }
    }

    if(!removed){
      System.out.println("No elements with this id!");
    }
  }

  public void search(String keyword){
    System.out.println();
    System.out.println("*********************");
    
    expenses.stream()
      .filter(e->e.getDescription()
              .toLowerCase()
              .contains(keyword))
      .forEach(e->System.out.println(e+"\n"));
  }

  public void filterByCategory(Category category){
    System.out.println();
    System.out.println("*********************");
    
    expenses.stream()
      .filter(e->e.getCategory() == category)
      .forEach(e->System.out.println(e+"\n"));
  }

  public double getMonthlyTotal(int month,int year){
    double total = expenses.stream()
      .filter(e->e.getDate().getYear() == year)
      .filter(e->e.getDate().getMonthValue() == month)
      .mapToDouble(Expense::getAmount)
      .sum();

    return total;
  }

  public void sortByAmount(int i){

    System.out.println("*********************");
    if(i==1){
    expenses.stream()
      .sorted(new SortByAmountAscending())
      .forEach(e->System.out.println(e+"\n"));
    }
    if(i==2){
      expenses.stream()
        .sorted(new SortByAmountAscending())
        .toList()
        .reversed()
        .stream()
        .forEach(e->System.out.println(e+"\n"));
    }
  }

  public void sortByDate(int i){

    System.out.println("*********************");
    if(i==1){
      expenses.stream()
        .sorted(new SortByDateNewestFirst())
        .forEach(e->System.out.println(e+"\n"));
    }
    if(i==2){
      expenses.stream()
        .sorted(new SortByDateNewestFirst())
        .toList()
        .reversed()
        .stream()
        .forEach(e->System.out.println(e+"\n"));
    }
  }

  public void categorySummary(){

    HashMap<Category, Double> categoryTotal = new HashMap<>();
    
    for(Category category:Category.values()){
      categoryTotal.put(category,0.0);
    }

    for(Expense expense:expenses){
      Category category = expense.getCategory();
      categoryTotal.put(category,categoryTotal.get(category)+expense.getAmount());
    }

    System.out.println("========= Category Summary =========");
    for(Category category:categoryTotal.keySet()){
      System.out.println(category+": "+ categoryTotal.get(category));
    }
    System.out.println();
  }

}

class SortByAmountAscending implements Comparator{

  public int compare(Object obj1, Object obj2){
    Expense exp1 = (Expense) obj1;
    Expense exp2 = (Expense) obj2;

    if(exp1.getAmount()>exp2.getAmount()) return 1;
    if(exp1.getAmount()<exp2.getAmount()) return -1;
    if(exp1.getAmount()==exp2.getAmount()) return 0;
    return 0;
  }
}

class SortByDateNewestFirst implements Comparator{
  
  public int compare(Object obj1, Object obj2){
    Expense exp1 = (Expense) obj1;
    Expense exp2 = (Expense) obj2;

    if(exp1.getDate().isAfter(exp2.getDate())) return -1;
    if(exp1.getDate().isBefore(exp2.getDate())) return 1;
    if(exp1.getDate().isEqual(exp2.getDate())) return 0;
    return 0;
  }
}