import java.util.Scanner;

public class takingInput03 {

    public static class Student {  // khudka ek data type bana liya hai , this is class
        String name;
        int rno;
        double cgpa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Ye Scanner bhi ek class hai and sc ek object hai
        
        Student s1 = new Student();  //  declaration , this is object
        s1.name = "Prajyot";
        s1.rno = sc.nextInt();
        s1.cgpa = 7.57;
        System.out.println(s1.rno);
        
    }
}