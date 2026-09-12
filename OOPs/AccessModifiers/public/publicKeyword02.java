public class publicKeyword02 {

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

/* Note :-
this also can be the eg of public access modifier because you have:

public class publicKeyword02
public static class Dog
public static class Cat
public static class Human
public static void main(...)

But note the important point:

public class publicKeyword02 → class can be accessed from other packages.
public static class Dog → nested Dog class can be accessed from outside publicKeyword02.
public static void main() → JVM needs access to call main().

*/