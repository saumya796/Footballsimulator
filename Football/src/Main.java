import backend.people.Player;
import sample.*;

public class Main {


    public static void main(String[] args) {

        Position position = new Position(4, 5);
        Position position2 = new Position(2, 5);

        GallCourt left = new GallCourt(29, 45, position);
        GallCourt right = new GallCourt(29, 45, position2);

        Ground ground = new Ground(2334, 5666, left, right);

        Ball ball = new Ball(new Position(30, 30));
        //ball.setGround(ground);
        Player player1 = new Player("lahiru", "teamA");
        player1.setGround(ground);
        player1.setBall(ball);
        System.out.println(player1.getName() + player1.getTeam());

        Player player2 = new Player("namal", "teamB");

        // game start
        while (!ground.isGallHit) {
            player1.runOrKick();
            player2.runOrKick();
        }

        System.out.println("game finished");

    }
}
