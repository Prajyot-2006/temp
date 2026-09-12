class Student {
    String name;
    int age;
    private int id;

    void getId() {  // getter - we are gettig some private properties
        System.out.println(id);
    }
    void setId(int x) {  // setter - we are setting some private properties
        id = x;
    }
}

public class EncapsulationAndGetterAndSetter03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aizen";
        s1.age = 20;
    //  s1.id = 76;  error
        s1.setId(76);
        s1.getId();
    }
}