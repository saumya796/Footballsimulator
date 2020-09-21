package backend;

public class Ground {
    private final int  widthMeters;
    private final int lengthMeters;
    private final double hlMeters;
    private final double ccrMeters;
    private final double plMeters;
    private final double pwMeters;
    private final Goalpost leftGoalpost;
    private final Goalpost rightGoalpost;
    public  boolean isGallHit = false;
    private Goalpost gcLeft;

    public Goalpost getGcRight() {
        return gcRight;
    }

    private Goalpost gcRight;

    public Football getBall() {
        return ball;
    }

    private Football ball;

    public Goalpost getLeftGoalpost() {
        return leftGoalpost;
    }

    public int getWidthMeters() {
        return widthMeters;
    }
    public int getLengthMeters() {
        return lengthMeters;
    }
    public double getHlMeters() {
        return hlMeters;
    }
    public double getCcrMeters(){
        return ccrMeters;
    }
    public double getPlMeters(){
        return plMeters;
    }
    public double getPwMeters(){
        return pwMeters;
    }
    public Ground(int widthMeters, int lengthMeters, double hlMeters, double ccrMeters, double plMeters, double pwMeters,  Goalpost rightGoalpost, Goalpost leftGoalpost){
        this.widthMeters = widthMeters;
        this.lengthMeters = lengthMeters;
        this.hlMeters = hlMeters;
        this.ccrMeters = ccrMeters;
        this.plMeters = plMeters;
        this.pwMeters = pwMeters;
        this.leftGoalpost = leftGoalpost;
        this.rightGoalpost = rightGoalpost;
    }


    public boolean evaluate() {
        // if ball is in any goal court nake isHitVar to be true
        //otherwise false
        //left right distance
        double LeftTargetGoalBallDistance = calcDistance(this.gcLeft.getgcPosition(), this.ball.getBallPosition());
        double RightTargetGoalBallDistance = calcDistance(this.gcRight.getgcPosition(), this.ball.getBallPosition());
        //print distance
        if (LeftTargetGoalBallDistance < 1){
            System.out.println("brazil Team hit the gall");
            isGallHit = true;
            return true;
        }

        if (RightTargetGoalBallDistance < 1){
            System.out.println("england Team hit the gall");
            isGallHit = true;
            return true;
        }

        else {
            return false;
        }
    }
    public double calcDistance(Position initialPosition, Position endPosition) {
        double x1 = initialPosition.getX();
        double y1 = initialPosition.getY();
        double x2 = endPosition.getX();
        double y2 = endPosition.getY();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return distance;
    }
}

