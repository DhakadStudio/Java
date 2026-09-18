package com.expensetracker.model;

import java.time.LocalDate;

public class Expense{

  static private int nextId = 1;
  private int id;
  private double amount;
  private String description;
  private Category category;
  private LocalDate date;

  public Expense() {
  }

  
  public Expense(double amount,String description, Category category ){
    this.id = nextId;
    Expense.updateNextId(this.id);
    this.amount = amount;
    this.description = description;
    this.category = category;
    this.date = LocalDate.now();
  }

  public static void updateNextId(int maxId){
    if(maxId >= nextId){
      nextId = maxId + 1;
    }
  }

  @Override
  public String toString(){
    return "ID: #" + this.id + "\nAmount: ₹" + amount + "\nDescription: " + description + "\nCategory: " + category + "\nDate: " + date;
  }

  public int getId(){
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
    Expense.updateNextId(id);
  }

  public void setAmount(double amount){
    this.amount = amount;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public void setCategory(Category category){
    this.category = category;
  }

  public void setDate(LocalDate date){
    this.date = date;
  }

  public String getDescription(){
    return this.description;
  }

  public Category getCategory(){
    return this.category;
  }

  public LocalDate getDate(){
    return this.date;
  }

  public Double getAmount(){
    return this.amount;
  }

}