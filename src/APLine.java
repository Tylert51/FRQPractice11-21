public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope() {
        double slope = (-1 * a) / (double) (b);
        return slope;
    }

    public boolean isOnLine(int x, int y) {
        int equation = (a * x) + (b * y) + c;
        return equation == 0;
    }

}
