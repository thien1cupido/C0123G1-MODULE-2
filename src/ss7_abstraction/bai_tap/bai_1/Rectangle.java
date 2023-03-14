package ss7_abstraction.bai_tap.bai_1;

public class Rectangle extends Square {
    private double length = 6.0;

    public Rectangle() {
    }

    public Rectangle(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length) {
        super(width);
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled, width);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return super.getWidth() * this.length;
    }

    public double getPerimeter() {
        return 2 * (super.getWidth() + this.length);
    }

    @Override
    public String toString() {
        return "Ractangle{" +
                "width=" + this.width +
                " Length=" +this.length +
                " Area=" + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        setWidth(this.width += this.width * percent / 100);
        setLength(this.length += this.length * percent / 100);
    }
}