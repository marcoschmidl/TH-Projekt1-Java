package Cocktailbar;

public class UnalkoholischeGetraenke<S,D> extends VorlageGetraenk<S,D> {

    public UnalkoholischeGetraenke(S name, D preis, S marke) {
        super(name, preis, marke);
    }


    @Override
    public String toString() {
        return " Name " + " \t " + getName() + " \t " + " Preis " + " \t " + getPreis() + " \t " + "Marke" + " \t   " + getMarke() +  " \n ";
    }


}