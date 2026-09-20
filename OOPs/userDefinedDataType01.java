public class userDefinedDataType01 {
    public static class Student {  // khudka ek data type bana liya hai , this is class
        String name;  // default value null 
        int rno;      // default value 0 
        double cgpa;   // default value 0.0
    }
    public static void main(String[] args) {
        Student s1 = new Student();  //  declaration , this is object  
        s1.name = "Prajyot";
        s1.rno = 76;
        s1.cgpa = 7.57;

        Student s2 = new Student();  //  declaration , this is object
        s2.name = "Pranav";
        s2.rno = 100;
        s2.cgpa = 9.37;

        Student s3 = new Student();  //  declaration , this is object
        s3.name = "Pappa";
        s3.rno = 101;
        s3.cgpa = 9.4;

        Student s4 = new Student();  //  declaration , this is object
        s4.name = "Mummy";
        s4.rno = 102;
        s4.cgpa = 9.2;

        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);
        System.out.println(s1);   // this prints reference value
        System.out.println(s2.name + " " + s2.rno + " " + s2.cgpa);
        System.out.println(s2);
        System.out.println(s3.name + " " + s3.rno + " " + s3.cgpa);
        System.out.println(s4.name + " " + s4.rno + " " + s4.cgpa);

    }
}

/*
Objects are real life entities - objects are actual creations , actual things
class is the blueprints
ham dot perator se initialize kar sakte hia print kar sakte hai and value badal bhi sakte hai
*/