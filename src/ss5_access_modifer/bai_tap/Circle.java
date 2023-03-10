package ss5_access_modifer.bai_tap;

public class Circle {
    private double radius =1;
    private String color ="red";

    public Circle(){
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Hình tròn: " +
                "bán kính=" +   radius +
                ", màu sắc='" + color + '\'';
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
}
