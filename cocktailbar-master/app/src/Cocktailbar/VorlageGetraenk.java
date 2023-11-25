package Cocktailbar;

public class VorlageGetraenk<S,D> {


         private final S name;
         private final D preis;
         private double alkoholgehalt;
         private S mischgetraenk;
         private S spirituose;
         private S marke;
         private S altersbeschraenkung;



    // konstrukor unalk
     public VorlageGetraenk(S name, D preis, S marke){
         this.name = name;
         this.preis = preis;
         this.marke = marke;

     }
     // konstruktor bier
     public VorlageGetraenk(S name, D preis, S altersbeschraenkung, double alkoholgehalt, S marke){
         this.name = name;
         this.preis = preis;
         this.altersbeschraenkung = altersbeschraenkung;
         this.alkoholgehalt = alkoholgehalt;
         this.marke = marke;
     }
     // konstruktor coktail
    public VorlageGetraenk(S name, D preis, S altersbeschraenkung , double alkoholgehalt, S mischgetraenk, S spirituose){

        this.name = name;
        this.preis = preis;
        this.alkoholgehalt = alkoholgehalt;
        this.altersbeschraenkung = altersbeschraenkung;
        this.mischgetraenk = mischgetraenk;
        this.spirituose = spirituose;


    }



    public S getAltersbeschraenkung() {
        return altersbeschraenkung;
    }

    public  S getName() {
        return name;
    }

    public D getPreis() {
        return preis;
    }

    public  double getAlkoholgehalt() {
        return alkoholgehalt;
    }

    public  S getMischgetraenk() {
        return mischgetraenk;
    }

    public  S getSpirituose() {
        return spirituose;
    }

    public S getMarke() {
        return marke;
    }

}
