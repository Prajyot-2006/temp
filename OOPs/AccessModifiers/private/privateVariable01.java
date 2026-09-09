// private variable
class Student {
    String name;
    private int id = 76;  // default value is 76
    int age;
    void print() {  // getter - we are gettig some private properties
        System.out.println(name + " " + id + " " + age + " ");
    }
}

public class privateVariable01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "prajyot";
        // s1.id = 76;  cannot assign , access , update the private variables
        s1.age = 20;
        s1.print();
    }
}