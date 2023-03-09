package ss4_class_and_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(this.b,2)-(4*this.a*this.c);
    }
    public double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/2*a;
    }
    public double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/2*a;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a= Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập b: ");
        double b= Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập c: ");
        double c= Float.parseFloat(scanner.nextLine());
        QuadraticEquation pT= new QuadraticEquation(a,b,c);
        double delta= pT.getDiscriminant();
        if (delta>=0){
            if (delta==0){
                System.out.println("Có 2 nghiệm bằng nhau x1=x2= "+ pT.getRoot1());
            }else {
                System.out.println("Có 2 nghiệm ");
                System.out.println("Có nghiệm x1= "+ pT.getRoot1());
                System.out.println("Có nghiệm x2= "+ pT.getRoot2());
            }
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
