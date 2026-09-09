public class checkIfWeCanAccesFamilyClassInThisFile05 {
    public static void main(String[] args) {
        // You need to create a new Family object here:
        Family f3 = new Family(); // Family class is already created in this package/folder and it has been created as default public 
        f3.DadName = "Datta";
        System.out.println(f3.DadName);
    }
}

/*
use case of this - agar aapke pass ek particular fn hai aur class hai jisme bohot sari cheeze hai 
jisko aap bohot sari files me use karna chahte ho , to ye technique use kar sakte ho
*/