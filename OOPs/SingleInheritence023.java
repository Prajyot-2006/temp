class Pokemon {
    int power;
    String name;
    String type;
    void print() {
        System.out.println(this.power + " " + this.name + " " + this.type);
    }
}

// Child class gets everything from Pokemon + its own extra property
class LegendaryPokemon extends Pokemon {  // LegendaryPokemon obviously has basic abilities like power and type so basically it has everything from parent class + something extra
    String ability;  // this is that extra property apart from parent class
}

public class SingleInheritence023 {
    public static void main (String[] args) {
        Pokemon p1 = new Pokemon();
        LegendaryPokemon l1 = new LegendaryPokemon();
        l1.power = 10000;       // parent class property - child class can also inherit
        l1.name = "mewto";        // parent class property
        l1.type = "Psychic";     // parent class property
        l1.ability = "pressure";    // child class property
        l1.print();
    }
}