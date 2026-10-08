import java.util.Scanner;

class Employee{
    double basicSalary;
    double allowance;

    double getGrossSalary(){
        return this.basicSalary + this.allowance;
    }
}

public class Emp{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter your salary: ");
        emp.basicSalary = sc.nextDouble();
        
        System.out.print("Enter your allowance: ");
        emp.allowance = sc.nextDouble();

        System.out.println("Gross Salary: "+emp.getGrossSalary());
    }
}