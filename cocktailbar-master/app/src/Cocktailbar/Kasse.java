package Cocktailbar;

import java.util.HashMap;
import java.util.Map;

public class Kasse {

    private double sum;
    private double umsatz;
    private double bestand;

    public Kasse (double sum, double umsatz, double bestand){
        this.sum = sum;
        this.umsatz = umsatz;
        this.bestand = bestand;
    }

    public void KasseHochfahren(){
        System.out.println("Kassensystem wird geladen.");
        System.out.println("Kassensystem ist jetzt einsatzbereit.");
        System.out.println("Der Anfangskassenbestand beträgt: " + bestand + " EUR");
        System.out.println("Fügen Sie einem Cocktailbar.Tisch eine Bestellung hinzu.");
    }

    public void zeigeBestellung (HashMap<String, VorlageGetraenk> map){
        sum = 0;
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

    public void tischAbrechnen (HashMap<String, VorlageGetraenk> map){
        umsatz = umsatz + sum;
        map.clear();
        System.out.println("Cocktailbar.Tisch abrechnen...");
        System.out.println("Die Rechnung wurde bezahlt.");
        System.out.println("Der aktuelle Tagesumsatz beträgt " + umsatz + " EUR");

    }

    public void zeigeKassenbestand(){
        bestand = bestand + umsatz;
        System.out.println("Der aktuelle Kassenbestand beträgt: " + bestand + " EUR");
    }

    public void KasseRunterfahren(){
        System.out.println();
        System.out.println("Cocktailbar.Kasse wird heruntergefahren.....");
        System.out.println("....Cocktailbar.Kasse ist aus.");
        umsatz = 0;
    }

    public static void karteAnzeigen(HashMap<String, VorlageGetraenk> testMap){
        System.out.println("____________________________________________");
        for (Map.Entry<String, VorlageGetraenk> entry : testMap.entrySet()){
            System.out.println(entry.getValue());
        }
        System.out.println("____________________________________________");
    }

}

