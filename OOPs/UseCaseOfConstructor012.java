
public class UseCaseOfConstructor012 {
    public static class StudentData {
        String name;
        int rno;
        int marks[];
        StudentData(int s) {
            marks = new int[s];
        }
        void print() {
            for(int ele : marks) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(2);
        s1.marks[0] = 75;
        s1.marks[1] = 79;
        s1.marks[2] = 80;
        s1.marks[3] = 90;
        s1.print();
        s2.marks[0] = 100;
        s2.marks[1] = 80;
        s2.print();
    }
}


/*
// we can also do like this : 
public class UseCaseOfConstructor012 {
    public static class StudentData {
        String name;
        int rno;
        int marks[];
        StudentData(int store[]) {
            marks = store;
        }
        void print() {
            System.out.println(name + " " + rno);
            for(int ele : marks) {
                System.out.print(ele + " ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int arr[] = {100,79,80,90};
        int brr[] = {100,79};
        StudentData s1 = new StudentData(arr);
        StudentData s2 = new StudentData(brr);
        s1.name = "Prajyot";
        s1.rno = 76;
        s2.name = "Ronin";
        s2.rno = 75;
        s1.print();
        s2.print();

    }
}

*/