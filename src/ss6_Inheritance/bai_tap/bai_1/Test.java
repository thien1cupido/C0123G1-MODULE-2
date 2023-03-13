package ss6_Inheritance.bai_tap.bai_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        int r=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập màu: ");
        String color= scanner.nextLine();
        System.out.print("Nhập chiều cao hình trụ: ");
        int h=Integer.parseInt(scanner.nextLine());
        Cylinder cylinder=new Cylinder();
        cylinder.radius=r;
        cylinder.heigh=h;
        cylinder.color=color;
        System.out.println(cylinder.toString());
    }
}
