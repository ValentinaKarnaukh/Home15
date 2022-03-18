import java.util.Arrays;

public class Main17 {
    public static void main(String[] args) {
        int[] speedPlayers = new int[3];
        speedPlayers[0] = 5;
        speedPlayers[1] = 0;
        speedPlayers[2] = 2;
        HomeWork17.amountLoser(speedPlayers);
        HomeWork17.arraySpeedLoser(speedPlayers);
        HomeWork17.arraySpeedWin(speedPlayers);


        System.out.println("Выбыло " + HomeWork17.amountLoser(speedPlayers));
        System.out.println(Arrays.toString(HomeWork17.arraySpeedLoser(speedPlayers)));
        System.out.println(Arrays.toString(HomeWork17.arraySpeedWin(speedPlayers)));
    }
}
