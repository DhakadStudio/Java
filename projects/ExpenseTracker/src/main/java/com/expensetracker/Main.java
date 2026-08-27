package com.expensetracker;

import com.expensetracker.model.Expense;
import com.expensetracker.model.Category;

public class Main{

  public static void main(String[] args){

    Expense ex = new Expense(500,"buying grocerirs",Category.FOOD);

    System.out.println(ex);
  }

  
}