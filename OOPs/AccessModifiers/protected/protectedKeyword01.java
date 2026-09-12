// protected → accessible in the same package + accessible in child classes (even in another package).

class Pokemon {

    protected int power = 100;
}

class LegendaryPokemon extends Pokemon {

    void showPower() {
        System.out.println(power);  // ✅ child class can access
    }
}

public class protectedKeyword01 {

    public static void main(String[] args) {

        LegendaryPokemon l = new LegendaryPokemon();

        l.showPower();
    }
}
/*you must be thinking - but even if we dont write protetced then also child can access properties of parent class yes (as we learned from inheritence) ?
answer : Yes. ✅ If you don't write any modifier, it is default/package-private, and a child class can access the parent's property if the child is in the same package.
But if the child is in a different package, then:
int power;          // default → ❌ child in different package
protected int power; // protected → ✅ child in different package

Simple difference
default → child can access if same package
protected → child can access even from a different package
So protected becomes useful mainly when inheritance crosses package boundaries.
*/