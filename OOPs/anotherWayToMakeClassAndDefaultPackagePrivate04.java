/*  this is very very imp
we can also make class like this in outside 
Class can also be created outside the main class.
No need for public static when the class is outside.
*/

/*
 * VERY IMPORTANT:
 *
 * If we create a class outside another class and don't write
 * any access modifier (public/private/protected), it gets
 * DEFAULT (package-private) access. package means folder
 *
 * Therefore, that class can be accessed from other classes
 * in the SAME PACKAGE/FOLDER.
 *
 * If we want to access the class from a DIFFERENT PACKAGE/FOLDER,
 * we need to make the class PUBLIC.
 */

// default/package-private 
class Family {  //this is class , we can remove public static when we make class outside 
    String DadName;
    String MomName;
    String BrotherName;
} // Package-private = "Only classes in the same package can access it."

public class anotherWayToMakeClassAndDefaultPackagePrivate04 {
    public static void main(String[] args) {

        Family f1 = new Family();
        f1.DadName = "Dnyaneshwar";
        f1.MomName = "Neeta";
        f1.BrotherName = "Pranav";

        Family f2 = new Family();
        f2.DadName = "Ganesh";
        f2.MomName = "Reshma";
        f2.BrotherName = "Sai";

        System.out.println(f1.DadName);
        System.out.println(f2.DadName);


    }
}
