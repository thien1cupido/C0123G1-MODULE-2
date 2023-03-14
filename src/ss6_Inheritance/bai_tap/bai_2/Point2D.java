package ss6_inheritance.bai_tap.bai_2;

import java.util.Arrays;

public class Point2D {
    protected float x = 0f;
    protected float y = 0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] getXY = new float[2];
        getXY[0] = this.x;
        getXY[1] = this.y;
        return getXY;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x= " + x +
                ", y= " + y +
                ", XY= " + Arrays.toString(getXY()) +
                '}';
    }
}
