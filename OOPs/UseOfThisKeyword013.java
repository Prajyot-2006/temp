public class UseOfThisKeyword013 {
    public static class Car {
        int price;
        String name;
        Car() {}
        Car(int price , String name) {  // why c1.name = null and c1.price = 0  ?
            price = price;  // coz it doesnot clearly identify price and name variable so it re-assigns price=1250000 and name=Kiaonet to the parameter's variable only not to the class variables
            name = name;  // inshort it means parameter price = parameter price and parameter name = parameter name
        }
        Car(String s , int x) {
            price = x;
            name = s;
        }
        void print() {
            System.out.println(name + " " + price);
        }
    }
    public static void main (String[] args) {
        Car c1 = new Car(1250000 , "Kia Sonet");
        c1.print();
        Car c2 = new Car("Lord Alto" , 400000);
        c2.print();
    }
}
// we can solve this problem using this keyword