package sample;

public class Ball {
    private Position ballPosition;

    public Position getBallPosition() {
        
        return ballPosition;
    }

    public void setBallPosition(Position ballPosition) {
        
        this.ballPosition = ballPosition;
    }

    public Ball(Position ballPosition) {
        
        this.ballPosition = ballPosition;
    }
}
