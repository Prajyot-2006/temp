/* ek naam multiple kaam
Polymorphism = "one thing, many forms."
In Java, it means the same method/name can behave differently in different situations.
*/
/*this is not polymorphism this is normal code for classes having same fn name in their own class so every fn are diferent from each other */
/*
public class Polymorphism07 {

    public static class Dog {
        void speak() {
            System.out.println("Bhau Bhau");
        }
    }

    public static class Cat {
        void speak() {
            System.out.println("Meow Meow");
        }
    }

    public static class Human {
        void speak() {
            System.out.println("Hello Hi");
        }
    }

    public static void main(String[] args) {
        Dog buzo = new Dog();
        Cat billu = new Cat();
        Human prajyot = new Human();

        buzo.speak();
        billu.speak();
        prajyot.speak();
    }
}
*/
// Compile-time Polymorphism = Method Overloading
class Calculator {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class Polymorphism07 {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(10, 20);       // calls 2-parameter add()
        c.add(10, 20, 30);   // calls 3-parameter add()
    }
}