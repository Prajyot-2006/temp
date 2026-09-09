public class NonStaticFn019 {
    public static void main (String[] args) {
        // fun();  You cannot call a non-static method directly from a static method.
    }
    private void fun() {  // non static fn
        System.out.println("Hello");
    }
}

// soln to this - is to make a object from  filename class : NonStaticFn019
/*
public class NonStaticFn019 {
    public static void main (String[] args) {
        NonStaticFn019 obj = new NonStaticFn019();
        obj.fun();  // ✅
    }
    private void fun() {  // non static fn
        System.out.println("Hello");
    }
}

*/