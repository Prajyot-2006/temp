/*
For Multiple Inheritance, the idea is:

One child class inherits from more than one parent class.
But ⚠️ Java does NOT allow multiple inheritance using classes. : class GodPokemon extends Pokemon, SuperPower { } // ❌
In Java, use interfaces
*/

class Pokemon {
    int power;
    String name;
    String type;

    void print() {
        System.out.println(power + " " + name + " " + type);
    }
}

// First interface
interface TimePower {
    void controlTime();
}

// Second interface
interface SpacePower {
    void controlSpace();
}

// GodPokemon inherits from Pokemon
// and implements multiple interfaces
class GodPokemon extends Pokemon implements TimePower, SpacePower {

    String divinePower;

    // Method from TimePower interface
    public void controlTime() {
        System.out.println("Can control time");
    }

    // Method from SpacePower interface
    public void controlSpace() {
        System.out.println("Can control space");
    }

    void showDivinePower() {
        System.out.println("Divine Power: " + divinePower);
    }
}

public class MultipleInheritence025 {

    public static void main(String[] args) {

        GodPokemon g1 = new GodPokemon();

        // From Pokemon class
        g1.power = 10000;
        g1.name = "Arceus";
        g1.type = "Normal";

        // From GodPokemon
        g1.divinePower = "Creation";

        // From TimePower interface
        g1.controlTime();

        // From SpacePower interface
        g1.controlSpace();

        g1.print();
        g1.showDivinePower();
    }
}

