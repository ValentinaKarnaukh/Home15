import java.util.Arrays;

public class HomeWork17 {
    static boolean isGreenLight;

    public static int amountLoser(int[] speeds) {
        int speedWin = 0;
        int loser = 0;
        if (isGreenLight) {
            loser = 0;
        } else {
            for (int i = 0; i < speeds.length; i++) {
                if (speedWin != speeds[i]) {
                    loser++;
                }
            }
        }
        return loser;
    }

    public static int[] arraySpeedLoser(int[] speeds) {
        int speedWin = 0;
        int cnt = 0;
        for (int speed : speeds) {
            if (isGreenLight) {
                continue;
            } else {
                if (speedWin != speed) {
                    cnt++;
                }
            }
        }

        int[] speedsLoser = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (isGreenLight) {
                continue;
            } else {
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
        for (int speed : speeds) {
            if (isGreenLight) {
                continue;
            } else {
                if (speedWin == speed) {
                    cnt++;
                }
            }
        }

        int[] speedsWin = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (isGreenLight) {
                continue;
            } else {
                if (speedWin == speed) {
                    speedsWin[i] = speed;
                    i++;
                }
            }
        }
        return speedsWin;
    }
}
