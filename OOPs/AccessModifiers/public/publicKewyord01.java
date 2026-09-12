// public → can be accessed from other classes, including classes in different packages (when the class itself is accessible).
class Student {

    public String name = "Prajyot";

    public void printName() {
        System.out.println(name);
    }
}

public class publicKewyord01 {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.name);  // ✅
        s.printName();               // ✅
    }
}

/*
class Student {

    String name = "Prajyot";

    void printName() {
        System.out.println(name);
    }
}

public class publicKewyord01 {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.name);  // ✅
        s.printName();               // ✅
    }
}
i guess this can be also the eg of it ? - Yes, but technically this example demonstrates default/package-private access, not public access
Because you wrote:

String name = "Prajyot";
void printName() {

with no modifier, both are default/package-private.
*/