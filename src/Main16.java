public class Main16 {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        int loser = 0;

        if (isGreenLight == true) {
            System.out.println("Выбывших: " + loser);
        } else {
            if (speedOfPlayer1 > 0) {
                System.out.println("Игрок выбыл!");
                loser++;
            } else {
                System.out.println("Игрок выиграл!");
            }

            if (speedOfPlayer2 > 0) {
                System.out.println("Игрок выбыл!");
                loser++;
            } else {
                System.out.println("Игрок выиграл!");
            }

            if (speedOfPlayer3 > 0) {
                System.out.println("Игрок выбыл!");
                loser++;
            } else {
                System.out.println("Игрок выиграл!");
            }

            System.out.println("Выбывших: " + loser);
        }
    }
}
