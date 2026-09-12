abstract class Pokemon {

    // Abstract method: tells WHAT to do, but not HOW to do it.
    abstract void attack();        // WHAT to do
}

class Pikachu extends Pokemon {

    @Override
    void attack() {     // HOW to do it
        System.out.println("Pikachu uses Thunderbolt");
    }
}

class Charizard extends Pokemon {

    @Override
    void attack() {
        System.out.println("Charizard uses Flamethrower");
    }
}

public class Abstraction027 {

    public static void main(String[] args) {

        Pikachu p1 = new Pikachu();
        p1.attack();

        Charizard c1 = new Charizard();
        c1.attack();
    }
}

/*
Pokemon says:-
Every Pokemon should have an attack() method.
But Pokemon doesn't decide how the attack happens.

Pikachu → Thunderbolt ⚡
Charizard → Flamethrower 🔥
That's abstraction: Tell WHAT to do, hide HOW it is done.
*/