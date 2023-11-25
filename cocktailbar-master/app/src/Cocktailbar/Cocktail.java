package Cocktailbar;

public class Cocktail<S,D> extends VorlageGetraenk<S,D> {
        public Cocktail(S name, D preis, S altersbeschraenkung, double alkoholgehalt, S mischgetraenk, S spirituose){
            super(name,preis,altersbeschraenkung,alkoholgehalt,mischgetraenk,spirituose);

        }
        @Override
        public String toString() {
        return " Name " + " \t " + getName() + " \t " + " Preis " + " \t " + getPreis() + " \t " + " Altersbeschraenkung "
                + " \t " + getAltersbeschraenkung() + " \t " + " Alkoholgehalt " + " \t " + getAlkoholgehalt() + " \t "
                + " Mischgetränk " + " \t " + getMischgetraenk() + " \t " + " Spirituose " + " \t " + getSpirituose() + "\n";
        }


}
