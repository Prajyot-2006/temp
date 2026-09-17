class Car {
    String name;
    String type;
    int year;
    double speed;
}
public class passingObjectsToMethods05 {

    public static void change(Car t1) { // this t1 is pointing to main function's c1 only 
        t1.name = "Lamborghini";
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Kia sonet";
        c1.type = "SUV";
        c1.year = 2025;
        c1.speed = 4.8282;
        System.out.println(c1.name);
        change(c1);
        System.out.println(c1.name);  //pass by reference
    }
}
