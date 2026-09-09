class Cricketer {
    final String country = "India";
    int runs;
    String name;
    double avg;
}

public class FinalKeyword016 {
    public static void main (String[] args) {
        Cricketer c1 = new Cricketer();
        System.out.println(c1.country);
        // c1.country = "NZ";    ERROR 

        Cricketer c2 = new Cricketer();
        System.out.println(c2.country);

        // or in simple way 
        final int x = 10;
    //  x = 20;   ERROR
        System.out.println(x);
    }
}