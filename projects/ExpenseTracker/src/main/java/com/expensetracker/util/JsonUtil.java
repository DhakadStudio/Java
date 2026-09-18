package com.expensetracker.util;

import com.expensetracker.model.Expense;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;


public class JsonUtil{

  private static final ObjectMapper mapper = new ObjectMapper();
  
  static {
    mapper.registerModule(new JavaTimeModule());
  }

  public static String listToJson(List<Expense> expenses){
    try{
      return mapper.writeValueAsString(expenses);
    }
    catch(JsonProcessingException e){
      System.out.println("Error in list to json!");
    }
    return null;
  }

  public static List<Expense> jsonToList(String json){
    try{
      return mapper.readValue(json,
                   new TypeReference<List<Expense>>(){});
    }
    catch(JsonProcessingException e){
      System.out.println("Error in json to list!");
    }
    return null;
  }
  
}