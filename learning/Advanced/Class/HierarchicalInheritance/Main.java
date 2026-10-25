

public class Main{
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();


        dog.eat();
        cat.eat();
        dog.bark();
        cat.meow();
    }
}

class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat meows");
    }
}