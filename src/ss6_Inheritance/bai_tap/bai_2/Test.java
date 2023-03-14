package ss6_inheritance.bai_tap.bai_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập y: ");
        float y = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập z: ");
        float z = Float.parseFloat(scanner.nextLine());
        Point3D point3D = new Point3D();
        point3D.setXYZ(x, y, z);
        System.out.println(point3D.toString());
    }
}
