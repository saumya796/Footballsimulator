package backend;

public class Position {

    private double x1;
    private double x2;
    private int x;
    private int y;
    private double y1;
    private double y2;

    public Position(double newX, double newY) {

    }

    public int getX() {
        return x;
    }
    public void setX(int newX) {
        this.x = newX;
    }
    public double getX1() {
        return x1;
    }
    public void setX1(double newX1) {
        this.x1 = newX1;
    }
    public double getX2() {
        return x2;
    }
    public void setX2(double newX2) {
        this.x2 = newX2;
    }
    public int getY() {
        return y;
    }
    public void setY(int newY) {
        this.y = newY;
    }
    public double getY1() {
        return y1;
    }
    public void setY1(double newY1) {
        this.y1 = newY1;
    }
    public double getY2() {
        return y2;
    }
    public void setY2(int newY2) {
        this.y2 = newY2;
    }
    public Position(int x, int y, double x1, double x2, double y1, double y2) {
        this.x = x;
        double x1Meters;
        this.y = y;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getx() {
        return x;

    }
    public double gety2() {
        return y2;
    }
    public String printPosition() {
        return "[" + (Math.round(x * 100.0) / 100.0) + "," + (Math.round(y * 100.0) / 100.0) + "]";
    }

}
