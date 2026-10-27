

abstract class Shape{

    abstract double calArea();
}

class Circle extends Shape{

    double radius = 5;

    @Override
    public double calArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{

    double len = 10;
    double bre = 5;

    @Override
    public double calArea(){
        return len*bre;
    }
}


public class Main{

    public static void main(String[] args){
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println(s1.calArea());
        System.out.println(s2.calArea());
    }
}