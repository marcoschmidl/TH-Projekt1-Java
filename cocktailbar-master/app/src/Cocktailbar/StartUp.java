package Cocktailbar;

import java.util.HashMap;


public class StartUp {

    public static void main(String[] args) {



        Kasse hauptkasse = new Kasse (0, 0,1000);

        // Getränke hier in der ArrayListe erstellen
        UnalkoholischeGetraenke<String, Double> wasser = new UnalkoholischeGetraenke<>("Wasser     ", 2.80, "   Adelholzner");
        UnalkoholischeGetraenke<String, Double> spezi = new UnalkoholischeGetraenke<>("Spezi      ", 2.80, "   Flötzinger");
        UnalkoholischeGetraenke<String, Double> limo = new UnalkoholischeGetraenke<>("Limo        ", 2.80, "   Adelholzner");

        Bier<String, Double> helles = new Bier<>("Helles     ", 3.20, "16", 5.0, "   Flötzinger");
        Bier<String, Double> dunklesbier = new Bier<>("Dunklesbier", 3.30, "16", 5.2, "   Augustiner");
        Bier<String, Double> weissbier = new Bier<>("Weißbier   ", 2.80, "16", 5.2, "   Schneider");

        Cocktail<String, Double> vodkalemon = new Cocktail<>("VodkaLemon ", 8.2, "18", 15,   "LemonWater",  "  Vodka");
        Cocktail<String, Double> gintonic = new Cocktail<>("Gintonic   ", 8.8, "18", 16,   "TonicWater",  "  Gin  ");
        Cocktail<String, Double> mojito = new Cocktail<>("Mojito     ", 8.5, "18", 16.5 ,   " SodaWater", "  Rum  ");

        //Erstellung der Getränkekarte aus den vorhandenen Getränken
        HashMap<String, VorlageGetraenk> getraenkeHashMap = new HashMap<>();
        getraenkeHashMap.put("1",wasser);
        getraenkeHashMap.put("2",spezi);
        getraenkeHashMap.put("3",limo);
        getraenkeHashMap.put("4",helles);
        getraenkeHashMap.put("5",dunklesbier);
        getraenkeHashMap.put("6",weissbier);
        getraenkeHashMap.put("7",vodkalemon);
        getraenkeHashMap.put("8", gintonic);
        getraenkeHashMap.put("9", mojito);

        //Gibt die erstelle HashMap für die Getränkekarte aus
        Kasse.karteAnzeigen(getraenkeHashMap);

        // Cocktailbar.Kasse Starten
        hauptkasse.KasseHochfahren();

        //Aufrufen eines neuen Tischs + Eingabe Bestellung
        //Über die statische Methode "zeigeBestellung2" kann die Bestellung und der Rechnungsbetrag angezeigt werden.
        Tisch tischEins = new Tisch(1);
        HashMap <String, VorlageGetraenk> tischeins = new HashMap<>();
        tischEins.zeigeTisch();
        tischeins.put("1",wasser);
        tischeins.put("2",spezi);
        tischeins.put("3",helles);
        hauptkasse.zeigeBestellung(tischeins);
        hauptkasse.tischAbrechnen(tischeins);
        //Erneuter Aufruf von zeigeBestellung() kann zur Prüfung benutzt werden ob Cocktailbar.Tisch leer ist.
        hauptkasse.zeigeBestellung(tischeins);

        Tisch tischZwei = new Tisch (2);
        HashMap <String, VorlageGetraenk> tischzwei = new HashMap<>();
        tischZwei.zeigeTisch();
        tischzwei.put("1", mojito);
        tischzwei.put("2", vodkalemon);
        tischzwei.put("3", gintonic);
        hauptkasse.zeigeBestellung(tischzwei);
        hauptkasse.tischAbrechnen(tischzwei);
        hauptkasse.zeigeBestellung(tischzwei);

        hauptkasse.zeigeKassenbestand();
       // hauptkasse.zeigeTagesumsatz();
        //Cocktailbar.Kasse wird heruntegefahren, der Tagesumsatz wird auf 0 zurückgesetzt.
        hauptkasse.KasseRunterfahren();
        //Bei erneutem Hochfahren der Cocktailbar.Kasse, wird der neue Kassenbestand übergeben.
        hauptkasse.KasseHochfahren();



    }

}



