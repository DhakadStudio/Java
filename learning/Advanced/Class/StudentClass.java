


class Student{
    String name;
    int age;

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class StudentClass{
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "Vishal Dhakad";
        s1.age = 20;
        s1.display();
    }
}