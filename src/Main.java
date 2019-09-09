import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    @Test
    void shouldConvert2toII() {
        assertEquals("II", toRoman(2));
    }

    @Test
    void shouldConvert3toIII() {
        assertEquals("III", toRoman(3));
    }

    @Test
    void shouldConvert4toIV() {
        assertEquals("IV", toRoman(4));
    }

   /* private String toRoman(int i) {
        if (i == 1)
            return "I";
        else if (i == 2)
            return "II";
        else if (i == 3)
            return "III";
        return null;
    } */

    private String toRoman(int numb) {
        String romanLetter = "";

        if (numb = 4)
            romanLetter = "IV";
        else (numb <4)
                else if
            for (int i = 0; i < numb; i++) {
                romanLetter += "I";

            }
            return romanLetter;
        }


    }

}
