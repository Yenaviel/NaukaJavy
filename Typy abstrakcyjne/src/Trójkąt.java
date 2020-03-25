public class Trójkąt implements Shape {
    private int a;
    private static final int H = 4;

    public Trójkąt(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getH() {
        return H;
    }



    @Override
    public double calculateArea() {
        return 0.5*a*H;
    }

    @Override
    public double calculatePerimeter() {
        return 3*a;
    }
}
