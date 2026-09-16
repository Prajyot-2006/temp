public class FileNameClassVeryImp029 {

    public static int add(int a , int b) {
        return a+b;
    }
    public static int sub(int a , int b) {
        return a-b;
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(add(a,b));
        System.out.println(sub(a, b));
    }

    int x;   // this is one of the property of FileNameClassVeryImp029 class
    int y;   // this also
    // also we cannot directly write executable statements like this inside a class, we need to put such executable code inside a method or constructor
    // System.out.println(100); 
    // x = x*y;   

}
