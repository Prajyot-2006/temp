class Car {
    int seats;   // 0
    String name;   // null
    double length;  // 0.0
 
    Car() {  // default constructor

    }

    Car(int x , String s , double d) {  // this is constructor
        seats = x;
        name = s;
        length = d;
    }
    void print() {
        System.out.println(seats + " " + name + " " + length + " ");
    }
}

public class Constructor09 {
    public static void main(String[] args) {
        Car c1 = new Car(7 , "Ertiga" , 5.6);
        System.out.println(c1.name);
        c1.print();
        
        Car c2 = new Car(8 , "Gwagon" , 9.6);
        System.out.println(c2.name);
        c2.print();

    }
}
