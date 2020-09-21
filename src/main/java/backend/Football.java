package backend;

public class Football {
    private final double xMeters;
    private double x1Meters;
    private double x2Meters;
    private final double yMeters;
    private double y1Meters;
    private double y2Meters;
    private final double radiusMeters;
    double distance;
    private Position playerPosition;
    private Football ball;
    private Goalpost gallCourt;

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public double getDistance() {
        return distance;
    }
    public double getX1Meters() {
        return x1Meters;
    }
    public double getX2Meters() {
        return x2Meters;
    }
    public double getY1Meters() {
        return y1Meters;
    }
    public double getY2Meters() {
        return y2Meters;
    }
    private final double circumstanceMeters;
    private String color;
    private Position ballPosition;

    public Position getBallPosition() {
        return ballPosition;
    }
    public void setBallPosition(Position BallPosition) {
        this.ballPosition = ballPosition;
    }
    public double getXMeters() {
        return xMeters;
    }
    public double getYMeters() {
        return yMeters;
    }
    public double getRadiusMeters() {
        return radiusMeters;
    }
    public double getCircumstanceMeters() {
        return circumstanceMeters;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }
    public Football(double xMeters, double yMeters, double radiusMeters, double circumstanceMeters, String color) {
        this.xMeters = xMeters;
        this.yMeters = yMeters;
        this.radiusMeters = radiusMeters;
        this.circumstanceMeters = circumstanceMeters;
        this.color = color;

    }
}






