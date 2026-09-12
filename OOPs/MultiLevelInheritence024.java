class Pokemon {
    int power;
    String name;
    String type;
    void print() {
        System.out.println(this.power + " " + this.name + " " + this.type);
    }
}

class LegendaryPokemon extends Pokemon {  
    String ability;  // this is that extra property apart from parent class
}

class GodPokemon extends LegendaryPokemon {
  // Gets everything from LegendaryPokemon + its own extra property
    String divinePower;
}

public class MultiLevelInheritence024 {
    public static void main (String[] args) {
        GodPokemon g1 = new GodPokemon();

        // From Pokemon
        g1.power = 10000;
        g1.name = "Dialga";
        g1.type = "Steel and Dragon";

        // From LegendaryPokemon
        g1.ability = "Telepathy and Pressure";

        // From GodPokemon
        g1.divinePower = "Control Time";

        // Method inherited from Pokemon
        g1.print();
    }
}