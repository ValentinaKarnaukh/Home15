public class HomeWork16 {
    boolean isGreenLight = false;

    public static boolean getSpeed1(int speedOfPlayer1) {
        int speedWin = 0;
        if (speedOfPlayer1 > speedWin) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean getSpeed2(int speedOfPlayer2) {
        int speedWin = 0;
        if (speedOfPlayer2 > speedWin) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean getSpeed3(int speedOfPlayer3) {
        int speedWin = 0;
        if (speedOfPlayer3 > speedWin) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        getSpeed1(5);
        getSpeed2(0);
        getSpeed3(2);

        System.out.println(getSpeed1(5));
        System.out.println(getSpeed2(0));
        System.out.println(getSpeed3(2));


    }
}
