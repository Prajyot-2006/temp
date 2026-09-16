class Pokemon { 
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
        pikachu.power = 100;  // gives error
        System.out.println(pikachu.power);  // gives error
    }
}

// Short note - private → accessible only inside the class where it is declared.