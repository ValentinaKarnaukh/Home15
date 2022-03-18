import java.util.Arrays;

public class HomeWork17 {
    static boolean isGreenLight = false;

    public static int amountLoser(int[] speeds) {
        int speedWin = 0;
        int Loser = 0;
        if (!isGreenLight) {
            for (int i = 0; i < speeds.length; i++) {
                if (speedWin != speeds[i]) {
                    Loser = Loser + 1;
                }
            }
        }
        return Loser;
    }

    public static int[] arraySpeedLoser(int[] speeds) {
        int speedWin = 0;
        int cnt = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speedWin != speed) {
                    cnt++;
                }
            }
        }
        int[] speedsLoser = new int[cnt];
        int i = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speedWin != speed) {
                    speedsLoser[i] = speed;
                    i++;
                }
            }
        }
        return speedsLoser;
    }

    public static int[] arraySpeedWin(int[] speeds) {
        int speedWin = 0;
        int cnt = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speedWin == speed) {
                    cnt++;
                }
            }
        }
        int[] speedsWin = new int[cnt];
        int i = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speedWin == speed) {
                    speedsWin[i] = speed;
                    i++;
                }
            }
        }
        return speedsWin;
    }
}
