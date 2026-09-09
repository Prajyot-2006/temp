/*
Constructor Overloading:
Having more than one constructor in the same class with different parameter lists. */
class Car{
    int seats;
    String name;
    double length;

    Car() { // default constructor - No-argument constructor when no arguments are passed that time this constructor works 

    }

    // Parameterized constructor.
    // Used to initialize object variables using the values passed as arguments.
    Car (String s , int x , double d) {
        name = s;
        seats = x;
        length = d;
    }
    
    void print() {
        System.out.println(seats + " " + name + " " + length);
    }
}

public class Constructor010 {

    public static void main (String[] args) {

        Car c1 = new Car("Wagonr" , 4 , 4.5);
        c1.print();
        
        Car c2 = new Car("Ferari" , 2 , 3.5);
        c2.print();

        Car c3 = new Car();  // Calls no-argument constructor(calls default constructor) Since no values are assigned, default values are used.
        c3.print();

    }
}

/*
Constructor overloading
If no arguments passed then it goes to default constructor 
If arguments are made and passes then it goes to manually made constructor
*/