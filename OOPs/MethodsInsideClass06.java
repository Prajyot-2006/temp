class Anime {  // is syntax ka purpose ya tha ? - ki ham baki files me bhi is class kouse kar paye
    String type;
    String name;
    int ep;
    int seasons;
    void print() {  // no need to use public static coz - Normal instance method; no need for public static
        System.out.println(type + " " + name + " " + ep + " " + seasons + " ");
    }  // so it is called using an object like bleach.print().
}

public class MethodsInsideClass06 {
    public static void main(String[] args) {
        Anime bleach = new Anime();
        bleach.type = "shonen";
        bleach.name = "Bleach";
        bleach.ep = 450;
        bleach.seasons = 5;

        Anime aot = new Anime();
        aot.type = "shonen";
        aot.name = "Attack On Titan";
        aot.ep = 89;
        aot.seasons = 5;

        bleach.print();
        aot.print();
    }
}
