public class MethodOverLoading08 {
    public static int max(int a , int b) {
        return Math.max(a,b);
    }
    public static double max(double a , double b , double c) {
        return Math.max(Math.max(a,b) , c);
    }
    public static void main(String[] args) {
        System.out.println(max(3,4));
        System.out.println(max(5.0,8.9,100.87));
    }
}