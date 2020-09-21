package backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void testCalcPosition1() {

        Player player = new Player("Amal");
        Position initPosition = new Position(3, 4);
        Position endPosition = new Position(0, 0);
        Position newPlayerPosition = player.calcPosition(initPosition, endPosition, 2);
    }

    @Test
    public void testCalcDistance2() {
        Player player = new Player("Amal");
        Position initPosition = new Position(1, 1);
        Position endPosition = new Position(2, 2);
        double testDistance = player.calcDistance(initPosition, endPosition);
        assertEquals(Math.sqrt(2), testDistance);
    }

    @Test
    public void testCalcPosition6() {

        Player player = new Player("Amal");
        Position initPosition = new Position(0, 0);
        Position endPosition = new Position(0, 5);
        Position newPlayerPosition = player.calcPosition(initPosition, endPosition, 2);
        assertEquals(0, newPlayerPosition.getX());
        assertEquals(2, newPlayerPosition.getY());
    }

    @Test
    public void testCalcDistance1() {
        Player player = new Player("Kamal");
        Position initPosition = new Position(1, 2);
        Position endPosition = new Position(10, 2);
        double testDistance = player.calcDistance(initPosition, endPosition);
        assertEquals(9, testDistance);
    }
}