package TestOrdner;

import Cocktailbar.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class StartUpTest {

    @Test
    void main() {

        //Test zu Methoden und der Vollständigkeit der HashMaps
        UnalkoholischeGetraenke<String, Double> wasser = new UnalkoholischeGetraenke<>("Wasser     ", 2.80, "Adelholzner");
        UnalkoholischeGetraenke<String, Double> spezi = new UnalkoholischeGetraenke<>("Spezi      ", 2.80, "Flötzinger");
        UnalkoholischeGetraenke<String, Double> limo = new UnalkoholischeGetraenke<>("Limo        ", 2.80, "Adelholzner");

        Bier<String, Double> helles = new Bier<>("Helles     ", 3.20, "16", 5.0, "   Flötzinger");
        Bier<String, Double> dunklesbier = new Bier<>("Dunklesbier", 3.30, "16", 5.2, "   Augustiner");
        Bier<String, Double> weißbier = new Bier<>("Weißbier   ", 2.80, "16", 5.2, "   Schneider");

        Cocktail<String, Double> vodkalemon = new Cocktail<>("VodkaLemon ", 8.2, "18", 15,   "LemonWater",  "  Vodka");
        Cocktail<String, Double> gintonic = new Cocktail<>("Gintonic   ", 8.8, "18", 16,   "TonicWater",  "  Gin  ");
        Cocktail<String, Double> mojito = new Cocktail<>("Mojito     ", 8.5, "18", 16.5, "SodaWater", "  Rum  ");


        HashMap<String, VorlageGetraenk> getraenkeHashMap = new HashMap<>();
        getraenkeHashMap.put("1",wasser);
        getraenkeHashMap.put("2",spezi);
        getraenkeHashMap.put("3",limo);
        getraenkeHashMap.put("4",helles);
        getraenkeHashMap.put("5",dunklesbier);
        getraenkeHashMap.put("6",weißbier);
        getraenkeHashMap.put("7",vodkalemon);
        getraenkeHashMap.put("8", gintonic);
        getraenkeHashMap.put("9", mojito);

        Assertions.assertTrue(getraenkeHashMap.containsKey("1") && getraenkeHashMap.get("1") != null);
        Assertions.assertTrue(getraenkeHashMap.containsKey("2") && getraenkeHashMap.get("2") != null);
        Assertions.assertTrue(getraenkeHashMap.containsKey("3") && getraenkeHashMap.get("3") != null);
        Assertions.assertTrue(getraenkeHashMap.containsKey("4") && getraenkeHashMap.get("4") != null);
        Assertions.assertTrue(getraenkeHashMap.containsKey("5") && getraenkeHashMap.get("5") != null);
        Assertions.assertTrue(getraenkeHashMap.containsKey("6") && getraenkeHashMap.get("6") != null);
        Assertions.assertTrue(getraenkeHashMap.containsKey("7") && getraenkeHashMap.get("7") != null);
        Assertions.assertTrue(getraenkeHashMap.containsKey("8") && getraenkeHashMap.get("8") != null);
        Assertions.assertTrue(getraenkeHashMap.containsKey("9") && getraenkeHashMap.get("9") != null);





        HashMap <String, VorlageGetraenk> tischeins = new HashMap<>();

        tischeins.put("1",wasser);
        tischeins.put("2",spezi);
        tischeins.put("3",helles);

        Assertions.assertTrue(tischeins.containsKey("1") && getraenkeHashMap.get("1") != null);
        Assertions.assertTrue(tischeins.containsKey("2") && getraenkeHashMap.get("2") != null);
        Assertions.assertTrue(tischeins.containsKey("3") && getraenkeHashMap.get("3") != null);


        HashMap <String, VorlageGetraenk> tischzwei = new HashMap<>();

        tischzwei.put("1", mojito);
        tischzwei.put("2", vodkalemon);
        tischzwei.put("3", gintonic);

        Assertions.assertTrue(tischzwei.containsKey("1") && getraenkeHashMap.get("1") != null);
        Assertions.assertTrue(tischzwei.containsKey("2") && getraenkeHashMap.get("2") != null);
        Assertions.assertTrue(tischzwei.containsKey("3") && getraenkeHashMap.get("3") != null);



        Kasse hauptkasse = new Kasse (0, 0,1000);

        Kasse.karteAnzeigen(getraenkeHashMap);
        hauptkasse.KasseHochfahren();
        hauptkasse.zeigeBestellung(tischeins);
        hauptkasse.zeigeKassenbestand();
        hauptkasse.KasseRunterfahren();
        hauptkasse.KasseHochfahren();





    }
}