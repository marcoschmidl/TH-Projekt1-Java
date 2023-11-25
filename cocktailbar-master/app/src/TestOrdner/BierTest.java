package TestOrdner;

import Cocktailbar.Bier;
import org.junit.jupiter.api.Test;

class BierTest {

    @Test
    void testToString() {
        Bier<String, Double> helles = new Bier<>("Helles     ", 3.20, "16", 5.0, "   Flötzinger");
        System.out.println(helles.toString());


    }
}