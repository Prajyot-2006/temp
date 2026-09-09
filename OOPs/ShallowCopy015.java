public class ShallowCopy015 {

    private static class Pokemon {
        int hp;
        int attack;
        String type;
        String name;
    }

    public static void main (String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu"; p1.type = "Electricity"; p1.attack = 70;

        Pokemon p2 = p1;   // p2 is shallow copy of p1 (means p2 can control p1 now)
        p2.type = "Water";
        System.out.println(p1.type);
    }
}