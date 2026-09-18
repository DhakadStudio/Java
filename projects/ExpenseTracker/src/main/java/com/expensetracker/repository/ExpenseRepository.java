package com.expensetracker.repository;

import com.expensetracker.model.Expense;
import com.expensetracker.util.JsonUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;


public class ExpenseRepository{

  private final Path filePath = Path.of("expenses.json");

  public void save(List<Expense> expenses){
    try{
      String json = JsonUtil.listToJson(expenses);
      Files.writeString(filePath,json);
    }
    catch(IOException e){
      System.out.println("Error in file writting!");
    }
  }

  public List<Expense> load(){
    try{
      String json = Files.readString(filePath);
      return JsonUtil.jsonToList(json);
    }
    catch(IOException e){
      System.out.println("Error in file reading!");
    }
    return new ArrayList<>();
  }
  
}