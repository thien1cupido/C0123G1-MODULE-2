package ss15_Exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các cạnh hình tam giác ");
        boolean flag = true;
        int a,b,c;
        try {
            System.out.print("Nhập cạnh a: ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập cạnh b: ");
            b = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập cạnh c: ");
            c = Integer.parseInt(scanner.nextLine());
            checkTriangleSide(a, b, c);
        } catch (NumberFormatException e) {
            System.out.println("a,b,c là số không phải chuỗi");
        }
        catch (ExceptionTriangleSide e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkTriangleSide(int a, int b, int c) throws ExceptionTriangleSide {
        if (a < 0 || b < 0 || c < 0 || (a + c) <= b || (b + c) <= a || (a + b) <= c) {
            throw new ExceptionTriangleSide("Cạnh a,b,c không phải là 1 cạnh của tam giác");
        } else {
            System.out.println("Cạnh a,b,c là cạnh của tam giác");
        }
    }
}
