package com.expensetracker.model;

import java.time.LocalDate;

public class Expense{

  static private int nextId = 1;
  private int id;
  private double amount;
  private String description;
  private Category category;
  private LocalDate date;

  public Expense(double amount,String description, Category category ){
    this.id = nextId;
    nextId ++;
    this.amount = amount;
    this.description = description;
    this.category = category;
    this.date = LocalDate.now();
  }


  @Override
  public String toString(){
    return "ID: #" + this.id + "\nAmount: " + amount + "\nDescription: " + description + "\nCategory: " + category + "\nDate: " + date;
  }

  public int getId(){
    return this.id;
  }
}