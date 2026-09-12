class Fraction {
    int num;
    int den;

    Fraction(int num , int den) {
        this.num = num;
        this.den = den;
        simplify();  // this is why u will understd constructor
    }
    void print() {
        System.out.println(this.num + "/" + this.den);
    }
    void add(Fraction temp) {
        int a = this.num;
        int b = this.den;
        int c = temp.num;
        int d = temp.den;
        this.num = a*d + c*b;
        this.den = this.den * d;
    }
    void mul(Fraction temp) {
        this.num = this.num * temp.num;
        this.den = this.den * temp.den;
        simplify();
    }
    void div(Fraction temp) {
        this.num = this.num * temp.den;
        this.den = this.den * temp.num;
        simplify();

    }
    int hcf(int a , int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0) return b;
        return hcf(b%a , a);
    }
    void simplify() {
        int gcd = hcf(this.num , this.den);
        this.num = this.num/gcd;
        this.den = this.den/gcd;
    }
}
public class HWVeryImpForConstructorUnderstanding022 {
    public static void main (String[] args) {
        Fraction f1 = new Fraction(3,7);
        f1.print();
        Fraction f2 = new Fraction(7,3);
        f1.add(f2);
        f1.mul(f2);
        f1.print();
        f1.div(f2);
        f1.print();
        Fraction f3 = new Fraction(-50 ,100);  // this is why u will understand constructor
        f3.print();  
    }
}