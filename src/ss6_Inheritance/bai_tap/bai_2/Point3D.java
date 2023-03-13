package ss6_Inheritance.bai_tap.bai_2;

import java.util.Arrays;

public class Point3D extends Point2D{
    float z=0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public float[] getXYZ() {
      float []getXYZ =new float[3];
      getXYZ[0]=this.x;
      getXYZ[1]=this.y;
      getXYZ[2]=this.z;
      return getXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                ", x= " + x +
                ", y= " + y +
                "z= " + z +
                ", XYZ= "+ Arrays.toString(getXYZ()) +
                '}';
    }
}
