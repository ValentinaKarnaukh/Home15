public class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int loser = 0;

        int speedOfPlayer1 = 0;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 0;

        if (isGreenLight == false) {
            if (speedOfPlayer1 != 0) {
                loser = loser + 1;
            }
            if (speedOfPlayer2 != 0) {
                loser = loser + 1;
            }
            if (speedOfPlayer3 != 0) {
                loser = loser + 1;
            }
        }

        System.out.println("Выбыло" + loser);
    }
}