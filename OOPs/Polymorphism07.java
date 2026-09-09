/* ek naam multiple kaam
Polymorphism = "one thing, many forms."
In Java, it means the same method/name can behave differently in different situations.
*/
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
