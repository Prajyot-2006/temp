public class updationUsingDotOperator02 {
   
    public static class Student {  // khudka ek data type bana liya hai , this is class
        String name;
        int rno;
        double cgpa;
    }

    public static void main (String[] args) {

        Student s1 = new Student();  //  declaration , this is object
        s1.name = "Prajyot";
        s1.rno = 76;
        s1.cgpa = 7.57;
        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);
        s1.cgpa = 7.74;
        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);
    }
}