

public class Main{
    public static void main(String[] args){
        ElectricCar ec = new ElectricCar();

        ec.start();
        ec.drive();
        ec.charge();
    }
}

class Vehicle{
    
    void start(){
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle{

    void drive(){
        System.out.println("Car is driving");
    }
}

class ElectricCar extends Car{

    void charge(){
        System.out.println("Battery is charging");
    }
}