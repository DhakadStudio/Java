package com.expensetracker;

import com.expensetracker.model.Expense;
import com.expensetracker.model.Category;
import java.util.ArrayList;

public class ExpenseService{

  ArrayList<Expense> expenses = new ArrayList<>();

  public void addExpense(double amount,String description,Category category){
    this.expenses.add(new Expense(amount, description, category));
  }

  public void displayAllexpenses(){
    for(Expense expense:this.expenses){
      System.out.println(expense);
    }
  }

  public void removeExpense(int id){
    bool removed = false;
    for(int i=0;i<this.expenses.size();i++){
      if(expenses.get(i).getId() == id){
        expenses.remove(i);
        removed = true;
        break;
      }
    }

    if(removed){
      System.out.println("No elements with this id!")
    }
  }
  
}