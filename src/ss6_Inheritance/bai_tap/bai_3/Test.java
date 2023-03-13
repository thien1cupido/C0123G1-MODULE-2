package ss6_Inheritance.bai_tap.bai_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập x: ");
        float x=Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập y: ");
        float y=Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập xSpeed: ");
        float xSpeed=Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập ySpeed: ");
        float ySpeed=Float.parseFloat(scanner.nextLine());
        MoveablePoint moveablePoint=new MoveablePoint();
        moveablePoint.setX(x);
        moveablePoint.setY(y);
        moveablePoint.setSpeed(xSpeed,ySpeed);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move());
    }
}
