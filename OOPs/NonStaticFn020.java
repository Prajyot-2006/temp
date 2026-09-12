public class NonStaticFn020 {
    public static void main (String[] args) {
        // fun();  You cannot call a non-static method directly from a static method.
    }
    private void fun() {  // non static fn
        System.out.println("Hello");
    }
}

// soln to this - is to make a object from  filename class : NonStaticFn020
/*
public class NonStaticFn020 {
    public static void main (String[] args) {
        NonStaticFn020 obj = new NonStaticFn020();
        obj.fun();  // ✅
    }
    private void fun() {  // non static fn
        System.out.println("Hello");
    }
}

*/