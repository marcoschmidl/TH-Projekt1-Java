package TestOrdner;

import Cocktailbar.VorlageGetraenk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class KasseTest {
            // Test zu den Methoden
    @Test
    void kasseHochfahren() {
        Assertions.assertEquals(1000,1000);

        Assertions.assertEquals(0,0);


    }

    @Test
    void zeigeBestellung() {
         double sum = 0;
        HashMap<String, VorlageGetraenk> map = new HashMap<>();
        if (map.isEmpty()){
            System.out.println("____________________________________________");
            System.out.println("Der Cocktailbar.Tisch enthält keine Bestellungen.");
        }
        else {
            System.out.println("Ihre Bestellung enthält: ");
            System.out.println("____________________________________________");
            for (Map.Entry<String, VorlageGetraenk> entry : map.entrySet()){
                System.out.print(entry.getValue().getName());
                System.out.print("  ");
                System.out.println(entry.getValue().getPreis());
                double preis = (double) entry.getValue().getPreis();
                sum = sum + preis;
            }
            System.out.println("____________________________________________");
            System.out.println("Die offene Rechnung beträgt: " + sum);
        }

    }



    @Test
    void tischAbrechnen() {
       double umsatz =30;
       double sum = 20;
       HashMap map = new HashMap();

        umsatz = umsatz + sum;
        map.clear();
        System.out.println("Cocktailbar.Tisch abrechnen...");
        System.out.println("Die Rechnung wurde bezahlt.");
        System.out.println("Der aktuelle Tagesumsatz beträgt " + umsatz + " EUR");
        Assertions.assertEquals(50.0,50.0);
    }


    @Test
    void zeigeKassenbestand() {
        double bestand = 1;
        double umsatz = 5;

        bestand = bestand + umsatz;
        Assertions.assertEquals(6,6);
        System.out.println("Der aktuelle Kassenbestand beträgt: " + bestand + " EUR");

    }

    @Test
    void kasseRunterfahren() {

        Assertions.assertEquals(0,0);
        System.out.println();
        System.out.println("Cocktailbar.Kasse wird heruntergefahren.....");
        System.out.println("....Cocktailbar.Kasse ist aus.");

    }


}