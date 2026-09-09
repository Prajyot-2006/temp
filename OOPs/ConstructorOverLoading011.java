class Car {
    String name;
    int price;
    Car () {  // default constructor

    }
    Car (int x , String s) {
        price = x;
        name = s;  

    }
    Car (String s , int x) {   
        name = s;
        price = x;
    }
    void print() {
        System.out.println(name + " " + " " + price);
    }
}

public class ConstructorOverLoading011 {
    public static void main (String[] args) {
        Car c1 = new Car("Lambo" , 839383292);
        c1.print();
        Car c2 = new Car(191919382 , "Audi");
        c2.print();
        Car c3 = new Car();
        c3.name = "BMW";
        c3.print();

    }
}