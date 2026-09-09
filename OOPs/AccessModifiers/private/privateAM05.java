class Pokemon {  // this private class is only accesible inside the privateAM04 class , we can even access it via psvm ,coz psvm is inside privateAM04 class
    private int power;    // now this private int power is only accesible inside Pokemon class not in other class like psvm because psvm is not inside Pokemon
    String type;

    Pokemon(String type , int power) {  // acting as setter
        this.power = power;
        this.type = type;
    }
}
public class privateAM05 {

    public static void main (String[] args) {
        Pokemon pikachu = new Pokemon("Electric" , 70);
        pikachu.type = "Water";
        pikachu.power = 100;
        System.out.println(pikachu.power);
    }
}

// Short note - private → accessible only inside the class where it is declared.