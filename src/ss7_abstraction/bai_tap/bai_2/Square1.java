package ss7_abstraction.bai_tap.bai_2;

public class Square1 extends Shape1 implements IColorable {
    protected double width = 4.0;

    public Square1() {
    }

    public Square1(double width) {
        this.width = width;
    }

    public Square1(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return Math.pow(width,2);
    }

    public double getPerimeter() {
        return width*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                " Area=" + getArea() +
                '}';
    }
    @Override
    public void resize(double percent) {
        setWidth(this.width+=this.width*percent/100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}