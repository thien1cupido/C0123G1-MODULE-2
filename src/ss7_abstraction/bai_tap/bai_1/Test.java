package ss7_abstraction.bai_tap.bai_1;

public class Test {
    public static void main(String[] args) {
        double  randomRisize=Math.round(Math.random()*99+1);
        Shape []shape=new Shape[3];
        shape[0]=new Circle();
        shape[1]=new Square();
        shape[2]=new Rectangle();
        for (Shape shape1:shape) {
            shape1.resize(randomRisize);
            System.out.println(shape1);
        }
    }
}
