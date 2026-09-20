class Temp {
    int y;
    void greet() {
        System.out.println("Hello ");
    }
}
public class OOPsConcept08 {
    public static void main(String[] args) {
        int x;
        // System.out.println(x);   --> gives errrorrr
        Temp t1 = new Temp();
        System.out.println(t1.y);   // doesnt give errrorr , prints default value 0 

    }
}
