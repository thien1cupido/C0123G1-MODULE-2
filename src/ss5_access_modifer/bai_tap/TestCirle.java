package ss5_access_modifer.bai_tap;

import java.util.Scanner;

public class TestCirle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double r=Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập màu sắc cho hình tròn: ");
        String color=scanner.nextLine();
        Circle circle=new Circle(r,color);
        System.out.println(circle.toString());
        System.out.println("Chu vi hình tròn "+circle.getPerimeter());
        System.out.println("Diện tích hình tròn "+circle.getArea());
    }
}
