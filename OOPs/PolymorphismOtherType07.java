// Runtime Polymorphism = Method Overriding

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Bhau Bhau");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meow Meow");
    }
}

public class PolymorphismOtherType07 {

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.speak();  // Bhau Bhau
        a2.speak();  // Meow Meow
    }
}