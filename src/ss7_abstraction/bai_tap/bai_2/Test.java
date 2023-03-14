package ss7_abstraction.bai_tap.bai_2;

import ss7_abstraction.bai_tap.bai_1.Square;

public class Test {
    public static void main(String[] args) {
    Square1 square=new Square1();
        System.out.println("Diện tích hình vuông");
        System.out.println(square.getArea());
        square.howToColor();
    }
}
