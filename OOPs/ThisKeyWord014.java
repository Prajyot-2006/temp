public class ThisKeyWord014 {
    public static class Car {
        int price;
        String name;
        Car() {}
        Car(int price , String name) {   // now this solves the same variable name issue
            this.price = price;  
            this.name = name;
        }
        Car(String s , int x) {
            price = x;
            name = s;
        }
        void print() {
            int price = 12;
            System.out.println(name + " " + price); // dummy price
            System.out.println(name + " " + this.price);   // current objects price
        }
    }
    public static void main (String[] args) {
        Car c1 = new Car(1250000 , "Kia Sonet");
        c1.print();
        Car c2 = new Car("Lord Alto" , 400000);
        c2.print();
    }
}