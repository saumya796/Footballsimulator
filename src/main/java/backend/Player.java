package backend;

public class Player {

    private double xMeters;
    private double x1Meters;
    private double x2Meters;
    private double yMeters;
    private double y1Meters;
    private double y2Meters;
    private int number;
    private String name;
    private double radiusMeters;
    private String color;
    private double distance;
    private Ground ground;
    private Position playerPosition;
    private Football ball;
    private double kick ;
    private Position ballPosition;
    private double playerBallDistance;
    private Goalpost gallCourt;

    public Player(double v, double v1, int i, double v2, String red, double goalpostdistance) {

    }
    public Player(String name) {
    }

    public double getPlayerBallDistance() {

        return playerBallDistance;
    }
    public Position getPlayerPosition() {
        return playerPosition;
    }
    public void setPlayerPosition(Position PlayerPosition) {
        this.playerPosition = PlayerPosition;
    }
    public Ground getGround() {
        return ground;
    }
    public void setGround(Ground Ground) {
        this.ground = Ground;
    }
    public double getXMeters() {
        return xMeters;
    }
    public void setXMeters(double newXMeters) {
        this.xMeters = newXMeters;
    }
    public void setX1Meters(double newX1Meters) {
        this.x1Meters = newX1Meters;
    }
    public double getX1Meters() {
        return x1Meters;
    }
    public double getX2Meters() {
        return x2Meters;
    }
    public void setX2Meters(double newX2Meters) {
        this.x2Meters = newX2Meters;
    }
    public double getYMeters() {
        return yMeters;
    }
    public void setYMeters(double newYMeters) {
        this.yMeters = newYMeters;
    }
    public double getY1Meters() {
        return y1Meters;
    }
    public void setY1Meters(double newY1Meters) {
        this.y1Meters = newY1Meters;
    }
    public double getY2Meters() {
        return y2Meters;
    }
    public void setY2Meters(double newY2Meters) {
        this.y1Meters = newY2Meters;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int newNumber) {
        this.number = newNumber;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public double getRadiusMeters() {
        return radiusMeters;
    }
    public void setRadiusMeters(double newRadiusMeters) {
        this.radiusMeters = newRadiusMeters;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }
    public double getDMeters() {
        return distance;
    }
    public void setDMeters(double newDMeters) {
        this.distance = newDMeters;
    }
    public Football getBall() {
        return ball;
    }
    public void setBall(Football ball) {
        this.ball = ball;
    }
    public Player(double xMeters, double x1Meters, double x2Meters, double y1Meters, double y2Meters, double yMeters, int number, double radiusMeters, String color, double goalpostdistance) {
        this.xMeters = xMeters;
        this.x1Meters = x1Meters;
        this.x2Meters = x2Meters;
        this.yMeters = yMeters;
        this.y1Meters = y1Meters;
        this.y2Meters = y2Meters;
        this.number = number;
        this.radiusMeters = radiusMeters;
        this.color = color;

    }
    public void runOrKick() {
        System.out.println(("player position : ") + this.playerPosition.getX() + this.playerPosition.getY());
        System.out.println(("ball position : ") + this.ball.getBallPosition().getX() + this.ball.getBallPosition().getY());

        double playerBallDistance = calcDistance(this.ball.getBallPosition(), this.playerPosition);
        double targetGoalBallDistance = calcDistance(this.gallCourt.getgcPosition(), this.ball.getBallPosition());

        System.out.println("distance : " + playerBallDistance);
        // if ball is to far run to the ball,
        //step1: if ball is far away than 5m, run 5m
        //step2: if distance is less than 5m, go 4m near
        if (playerBallDistance > 1) {

                Position newPlayerPosition = calcPosition(this.playerPosition, this.ball.getBallPosition(), 2);

                setPlayerPosition(newPlayerPosition);

                System.out.println("distance : " + playerBallDistance);
                System.out.println(("player position : ") + this.playerPosition.getX() + this.playerPosition.getY());
                System.out.println(("ball position : ") + this.ball.getBallPosition().getX() + this.ball.getBallPosition().getY());


        }// else {
        // if distance is less than 1 m, he kick to the ball towards the middle of the goal
        if (playerBallDistance <= 1){

                backend.Position newBallPosition = calcPosition(this.ball.getBallPosition(), this.gallCourt.getgcPosition(), 5);

                ball.setBallPosition(newBallPosition);
            }
    }
    public Position calcPosition(backend.Position initialPosition, backend.Position endPosition, double movement) {
        double x1 = initialPosition.getX();
        double y1 = initialPosition.getY();
        double x3 = endPosition.getX();
        double y3 = endPosition.getY();

        if (x1 == x3) {
            double newX = x1;
            double newY = y1 + movement;
            return new Position(newX, newY);
        }
        if (y1 == y3) {
            double newY = y1;
            double newX = x1 + movement;
            return new Position(newX, newY);

        } else {
            double newX = Math.sqrt(Math.pow(movement, 2) / (Math.pow((y3 - y1) / (x3 - x1), 2)) + 1) + x1;
            double newY = Math.sqrt(Math.pow(movement, 2) / (Math.pow((x3 - x1) / (y3 - y1), 2)) + 1) + y1;
            return new Position(newX, newY);

        }
    }

    public double calcDistance(backend.Position initialPosition, backend.Position endPosition) {
        //todo implement here
        double x1 = initialPosition.getX();
        double y1 = initialPosition.getY();
        double x2 = endPosition.getX();
        double y2 = endPosition.getY();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return distance;
    }

}


