package backend.people;

import sample.Ground;
import sample.Position;

public class Player {
    private Position playerPosition;
    private String name;
    private String team;

    private Ground ground;

    public Player(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public Position getPlayerPosition() {

        return playerPosition;
    }

    public void setPlayerPosition(Position playerPosition) {

        this.playerPosition = playerPosition;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.team = name;
    }

    public String getTeam() {

        return team;
    }

    public void setTeam(String team) {

        this.name = team;
    }

    public void run() {

        System.out.println("Player is running");
    }

    public void kick() {

    }
    public  void runOrKick(){

    }

    public void action() {

    }
    public void setGround(){

    }

    public void setGround(Ground newGround) {
        this.ground = newGround;
    }
}
