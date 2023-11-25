package TestOrdner;

import Cocktailbar.Cocktail;
import org.junit.jupiter.api.Test;

class CocktailTest {

    @Test
    void testToString() {
        Cocktail<String, Double> gintonic = new Cocktail<>("Gintonic   ", 8.8, "18", 16,   "TonicWater",  "  Gin  ");
        System.out.println(gintonic.toString());
    }
}