import java.util.*;

public class Main {
    public static void main(String[] args) {
      Student s = new Student("vishal dhakad", 20,"indore",21,99.0);

        s.displayInfo();
        s.displayRollNo();
        s.displayMarks();
    }
}

class Person{
    
    String name;
    int age;
    String address;

    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address: " + address);
    }
}

class Student extends Person{

    int rollNo;
    double marks;
     
    Student(String name, int age, String address,int rollNo, double marks){
        super(name, age, address);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayRollNo(){
        System.out.println("Roll No: "+ rollNo);
    }
    
    void displayMarks(){
        System.out.println("Marks: "+ marks);
    }
}