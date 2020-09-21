package sample;

public class Ground {

    private final Integer length;
    private final Integer width;
    private final GallCourt leftGoalCOurt;
    private final GallCourt rightGoalCOurt;
    private double dMeters;


    public boolean isGallHit = false;

    


    public Ground(Integer length, Integer width, GallCourt leftGoalCOurt, GallCourt rightGoalCOurt) {
        this.length = length;
        this.width = width;
        this.leftGoalCOurt = leftGoalCOurt;
        this.rightGoalCOurt = rightGoalCOurt;
    }
}
