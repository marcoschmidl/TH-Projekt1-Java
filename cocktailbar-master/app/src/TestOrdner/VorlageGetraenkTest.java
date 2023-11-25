package TestOrdner;

import Cocktailbar.Bier;
import Cocktailbar.Cocktail;
import Cocktailbar.UnalkoholischeGetraenke;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class VorlageGetraenkTest {

    @Test
    void getAltersbeschraenkung() {
        Bier<String, Double> helles = new Bier<>("Helles     ", 3.20, "16", 5.0, "   Flötzinger");
        assertNotNull(helles,helles.getName());
        Cocktail<String, Double> vodkalemon = new Cocktail<>("VodkaLemon ", 8.2, "18", 15,   "LemonWater",  "  Vodka");
        assertNotNull(vodkalemon,vodkalemon.getName());

    }


    @Test
    void getName() {
        UnalkoholischeGetraenke<String, Double> wasser = new UnalkoholischeGetraenke<>("Wasser     ", 2.80, "Adelholzner");
        assertNotNull(wasser,wasser.getName());

        Bier<String, Double> helles = new Bier<>("Helles     ", 3.20, "16", 5.0, "   Flötzinger");
        assertNotNull(helles,helles.getName());

        Cocktail<String, Double> vodkalemon = new Cocktail<>("VodkaLemon ", 8.2, "18", 15,   "LemonWater",  "  Vodka");
        assertNotNull(vodkalemon,vodkalemon.getName());

    }

    @Test
    void getPreis() {

        UnalkoholischeGetraenke<String, Double> wasser = new UnalkoholischeGetraenke<>("Wasser     ", 2.80, "Adelholzner");
        assertEquals(2.8,wasser.getPreis());

        Bier<String, Double> helles = new Bier<>("Helles     ", 3.20, "16", 5.0, "   Flötzinger");
        assertEquals(3.2,helles.getPreis());

        Cocktail<String, Double> vodkalemon = new Cocktail<>("VodkaLemon ", 8.2, "18", 15,   "LemonWater",  "  Vodka");
        assertEquals(8.2,vodkalemon.getPreis());

    }

    @Test
    void getAlkoholgehalt() {

        Bier<String, Double> helles = new Bier<>("Helles     ", 3.20, "16", 5.0, "   Flötzinger");
        assertEquals(5.0,helles.getAlkoholgehalt());

        Cocktail<String, Double> vodkalemon = new Cocktail<>("VodkaLemon ", 8.2, "18", 15,   "LemonWater",  "  Vodka");
        assertEquals(15,vodkalemon.getAlkoholgehalt());
    }

    @Test
    void getMischgetraenk() {


        Cocktail<String, Double> vodkalemon = new Cocktail<>("VodkaLemon ", 8.2, "18", 15,   "LemonWater",  "  Vodka");
        assertNotNull(vodkalemon,vodkalemon.getMischgetraenk());
    }

    @Test
    void getSpirituose() {

        Cocktail<String, Double> vodkalemon = new Cocktail<>("VodkaLemon ", 8.2, "18", 15,   "LemonWater",  "  Vodka");
        assertNotNull(vodkalemon,vodkalemon.getSpirituose());
    }

    @Test
    void getMarke() {
        Bier<String, Double> helles = new Bier<>("Helles     ", 3.20, "16", 5.0, "   Flötzinger");
        assertNotNull(helles,helles.getMarke());
    }
}