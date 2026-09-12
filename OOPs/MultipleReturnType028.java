class Bleach {
    String mc;
    void print() {
        System.out.print("Ichigo");
        System.out.print("Urahara");
        System.out.print("Aizen");
        System.out.print("Uryu");
        System.out.print("Yuhabaha");
    }
    int ep() {
        return 366 + 63;
    }
    double rating() {
        return 9.8;
    }

}

public class MultipleReturnType028 {
    public static void main (String[] args) {
        Bleach b1 = new Bleach();
        int totalEp = b1.ep();
        double overallRating = b1.rating();
        System.out.println(totalEp);
        System.out.println(overallRating);
    }
}