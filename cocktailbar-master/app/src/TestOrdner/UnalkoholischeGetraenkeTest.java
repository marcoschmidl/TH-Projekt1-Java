package TestOrdner;

import Cocktailbar.UnalkoholischeGetraenke;
import org.junit.jupiter.api.Test;


class UnalkoholischeGetraenkeTest {

    @Test
    void testToString() {
        UnalkoholischeGetraenke<String, Double> limo = new UnalkoholischeGetraenke<>("Limo        ", 2.80, "Adelholzner");
        System.out.println(limo.toString());
    }
}