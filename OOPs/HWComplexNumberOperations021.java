// QUES : Create a complex number & create a fn to ad , mul and div the complex numbers 
class ComplexNumber {  // x + iy
    double x;
    double y;

    ComplexNumber(double x , double y) {
        this.x = x;
        this.y = y;
    }
    
    void print() {
        if(y>0) System.out.println(x + " + i"+y);
        else {
            double store = -1*this.y;
            System.out.println(x + " - i"+store);
        }
    }
    void add(ComplexNumber temp) {
        this.x = this.x + temp.x;
        this.y = this.y + temp.y;
    }
    void mul(ComplexNumber temp) {
        double x = this.x;
        double y = this.y;
        double eq1 = x*temp.x;
        double eq2 = x*temp.y;
        double eq3 = y*temp.x;
        double eq4 = (y*temp.y)*-1;
        this.x = eq1+eq4;
        this.y = eq2+eq3;
    }
    void div(ComplexNumber temp) {
        double a = this.x;
        double b = this.y;
        double c = temp.x;
        double d = temp.y;

        double denominator = c * c + d * d;

        double real = (a * c + b * d) / denominator;
        double imaginary = (b * c - a * d) / denominator;

        this.x = real;
        this.y = imaginary;
    }
}

public class HWComplexNumberOperations021 {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(3 , 7);
        ComplexNumber z2 = new ComplexNumber(3 , 2);
        // z1.mul(z2);  // (3+7i)(3+2i)
        z1.div(z2);
        z1.print();
        
    }
}