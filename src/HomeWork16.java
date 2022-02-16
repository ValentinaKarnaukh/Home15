public class HomeWork16 {
    static boolean isGreenLight = false;

    public static boolean speed1(int speedOfPlayer1) {
        int speedWin = 0;
        return (speedOfPlayer1 > speedWin);
    }

    public static boolean speed2(int speedOfPlayer2) {
        int speedWin = 0;
        return (speedOfPlayer2 > speedWin);
    }

    public static boolean speed3(int speedOfPlayer3) {
        int speedWin = 0;
        return (speedOfPlayer3 > speedWin);
    }

    public static void main(String[] args) {
        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;
        int loser = 0;
        if ((speed1(5)) == true) {
            System.out.println("Игрок выбыл!");
            loser = loser + 1;
        } else {
            System.out.println("Игрок выиграл!");
        }
        if ((speed2(0)) == true) {
            System.out.println("Игрок выбыл!");
            loser = loser + 1;
        } else {
            System.out.println("Игрок выиграл!");
        }
        if ((speed3(2)) == true) {
            System.out.println("Игрок выбыл!");
            loser = loser + 1;
        } else {
            System.out.println("Игрок выиграл!");
        }
        System.out.println("Выбыло " + loser);
    }
}

