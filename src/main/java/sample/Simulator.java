package sample;

import backend.*;

public class Simulator {

    public static double getGoalpostdistance() {
        return goalpostdistance;
    }

    private static double goalpostdistance;

    public static void main(String[] args) {

        Position position = new Position(4, 5);
        Position position2 = new Position(4, 5);

        Goalpost left = new Goalpost(29, 45, position);
        Goalpost right = new Goalpost(29, 45, position2);

        Ground ground = new Ground(30, 100, 30, 5, 15, 5, left, right);
        Football ball;

        ball = new Football(0.12, 0.45, 0.68, 0.1081, "white");

        Player brazil;

        brazil = new Player(0.43, 0.26, 1, 0.12, "Yellow", goalpostdistance);
        brazil.setPlayerPosition(position);
        brazil.setGround(ground);
        brazil.setBall(ball);
        System.out.println(brazil.getNumber());

        Player england;

        england = new Player(0.43, 0.26, 1, 0.12, "Red", goalpostdistance);
        england.setPlayerPosition(position);
        england.setGround(ground);
        england.setBall(ball);
        System.out.println(england.getNumber());

        while (!ground.isGallHit) {
            brazil.runOrKick();
            if (Controller.evaluate()) {
                continue;
            }
            england.runOrKick();
            if (Controller.evaluate()) {
                continue;
            }
        }
        System.out.println("Game Finished");
    }
}
