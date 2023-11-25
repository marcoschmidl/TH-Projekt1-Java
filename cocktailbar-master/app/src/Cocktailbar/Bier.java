package Cocktailbar;

public  class Bier<S,D> extends VorlageGetraenk<S,D> {

    public Bier(S name, D preis, S altersbeschraenkung, double alkoholgehalt, S marke){
        super(name, preis, altersbeschraenkung, alkoholgehalt, marke);
    }

    public String toString() {
        return  " Name " + " \t " + getName() + " \t " + " Preis " + " \t " + getPreis() + " \t " + " Altersbeschraenkung " + "\t "
                + getAltersbeschraenkung() + " \t " + " Alkoholgehalt " + "\t " + getAlkoholgehalt() + " \t " + " Marke "  + " \t " + getMarke() + " \n ";

    }

}


