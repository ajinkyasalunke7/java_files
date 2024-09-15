// Complex.java

import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    // Default constructor
    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Parameterized constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public double add() {
        return this.real + this.imaginary;
    }
    public double sub() {
        return (this.real - this.imaginary);
    }
    public double mul() {
        return this.real * this.imaginary;
    }
    public double div() {
        return this.real / this.imaginary;
    }
    
    public static void main(String[] args) {
        // Create two complex numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first complex number: ");
        double fNum = Double.parseDouble( sc.nextLine());
        System.out.print("Enter second complex number: ");
        double sNum = Double.parseDouble( sc.nextLine());
        Complex c = new Complex(fNum, sNum);

    
        System.out.println("Sum: "+ c.add());
        System.out.println("Difference: "+c.sub());
        System.out.println("Product: "+ c.mul());
        System.out.println("Quotient: "+ c.div());
       
    }
}
