package ss7_abstraction.bai_tap.bai_1;

public class Circle extends Shape {
    private double radius = 5.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius *this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 *this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " Area=" + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        setRadius(this.radius+= this.radius*percent/100);
    }
}