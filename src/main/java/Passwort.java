import java.util.Scanner;

public class Passwort {


    public static String Passwort5(String s) {
        int actuallengthPasswords = Passwort.length();

        if (actuallengthPasswords < 4) {
            return "the length for Passwort too short";
        } else if (actuallengthPasswords >= 5) {
            return "the length for Passwort very nice";
        } else {
            return "please try again";
        }
    }

    private static int length() {
        return 3;
    }

    public static String Passwort10(String s) {
        int actuallengthPasswords = Passwort.length();

        if (actuallengthPasswords >11) {
            return "the length for Passwort very nice";
        } else if (actuallengthPasswords >= 10) {
            return "the length for Passwort very nice";
        } else {
            return "please try again";
        }

        }

    public static boolean counts(String count) {
        char[] chars = count.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;

    }


}



