class Cricketer {
    final static String country = "NZ";
    int runs;
    String name;
    double avg;
}

public class FinalStaticKeyword018 {
    public static void main (String[] args) {
        Cricketer c1 = new Cricketer();
        Cricketer c2 = new Cricketer();
        // c1.country = "Japan"; cannot update coz of final keyword
        System.out.println(c2.country);
    }
}