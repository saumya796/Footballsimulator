package backend;

public class Position {

    private double x;
    private double y;

    public Position(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String printPosition() {
        return "[" + (Math.round(x * 100.0) / 100.0) + "," + (Math.round(y * 100.0) / 100.0) + "]";
    }

}
