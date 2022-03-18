public class HomeWork16 {
    public static boolean isGreenLight;


    public static String checkSpeed (int speedOfPlayer) {
        String result;

        if (!isGreenLight) {
            result = "игрок проходит";
        } else {
            if (speedOfPlayer == 0) {
                result = "игрок проходит";
            } else {
                result = "игрок не проходит";
            }
        }
        return result;
    }
}

