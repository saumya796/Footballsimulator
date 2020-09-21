package backend;

public class Goalpost {
    private final int length;
    private final int width;
    private final Position centerPosition;
    private Position gcPosition;

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public Position getCenterposition() {
        return centerPosition;
    }
    public Goalpost(int length, int width, Position centerposition) {
        this.length = length;
        this.width = width;
        this.centerPosition = centerposition;
    }
    public Position getgcPosition() {
        return gcPosition;
    }
}
