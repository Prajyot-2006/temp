// private method

class Student {
    String name;
    private int id = 76;  // default value is 76
    int age;
    private void print() {
        System.out.println(name + " " + id + " " + age + " ");
    }
    void call() {
        print();
    }
}

public class privateMethod02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.print(); we cannot access this private fn here in other class
        s1.call();

    }
}
