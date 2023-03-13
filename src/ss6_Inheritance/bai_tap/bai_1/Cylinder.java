package ss6_Inheritance.bai_tap.bai_1;

public class Cylinder extends Circle{
    int heigh=2;

    public Cylinder() {
    }

    public Cylinder(int radius, String color, int heigh) {
        super(radius, color);
        this.heigh=heigh;
    }
    public double volumeOfCylinder(){
        return getCircleArea()*heigh;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "heigh=" + heigh +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", PI=" + PI +
                ", thể tích của hình trụ= "+volumeOfCylinder()+ " cm3"+
                '}';
    }
}
