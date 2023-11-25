package TestOrdner;

import Cocktailbar.Kasse;
import Cocktailbar.Tisch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TischTest {

    @Test
    void getTischnr() {

        Tisch tischEins = new Tisch(1);
        Assertions.assertNotNull(tischEins);
        Assertions.assertEquals(1,1);

        Tisch tischZwei = new Tisch (2);
        Assertions.assertNotNull(tischZwei);
        Assertions.assertEquals(2,2);

        Kasse hauptkasse = new Kasse (0, 0,1000);
        Assertions.assertNotNull(hauptkasse);


    }

}
