import java.util.Scanner;

public class Passwort {

    public static void main(String[] args) {
        System.out.println(Passwort("hongk"));
    }

    public static String Passwort(String Passworts) {
        int actuallengthPasswords = Passworts.length();

        if (actuallengthPasswords < 4) {
            return "the length for passwort too short";
        } else if (actuallengthPasswords >= 5) {
            return "the length for passwort very nice";
        } else {
            return "please try again";
        }
    }

        public static boolean counts(String count){
            char[] chars = count.toCharArray();
            for(char c : chars){
                if(Character.isDigit(c)){
                    return true;
                }
            }  return false;

            }
        }

