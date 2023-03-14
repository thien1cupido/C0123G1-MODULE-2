package ss7_abstraction.bai_tap.bai_2;

import ss7_abstraction.bai_tap.bai_1.IResizeable;

public abstract class Shape1 implements IResizeable {
    private String color = "green";
    private boolean filled = true;

    public Shape1() {
    }

    public Shape1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}