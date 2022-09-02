import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswortTest {


    @Test
    void Passworts5() {
        //GIven
        String password = "hon";

        //WHEN
        String conclusion = Passwort.Passwort5("hon");

        //THEN
        assertEquals("the length for password too short", conclusion);
    }

    @Test
    void Passworts10() {
        //GIven
        String password = "hongkonghi";

        //WHEN
        String conclusion = Passwort. Passwort10("hongkonghi");


        //THEN
        assertEquals("the length for passwort very nice", conclusion);
    }




    @Test
    void getRandomcouts() {
        //GIVEN
        String result = "1,2,3,4,5,6,7,8,9,0";

        //WHEN
        boolean a = Passwort.counts("1,2,3,4,5,6,7,8,9,0");

        //THEN
        assertEquals(true, a);

    }
    @Test
    void getRandomPasswordcout() {
        //GIVEN
        String result = "none";

        //WHEN
        boolean b = Passwort.counts(result);

        //THEN
        assertEquals(false, b);

    }


}




