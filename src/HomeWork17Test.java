import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork17Test {

    @Test
    public void isRedLight() {
        boolean isGreenLight = false;
        boolean expected = false;
        boolean actual = HomeWork17.isGreenLight;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void twoLosers() {
        int[] speedPlayers = {5, 0, 2};
        int expected = 2;
        int actual = HomeWork17.amountLoser(speedPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arrayLosers() {
        int[] speedPlayers = {5, 0, 2};
        int[] expected = {5, 2};
        int[] actual = HomeWork17.arraySpeedLoser(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayWin() {
        int[] speedPlayers = {5, 0, 2};
        int[] expected = {0};
        int[] actual = HomeWork17.arraySpeedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }
}
