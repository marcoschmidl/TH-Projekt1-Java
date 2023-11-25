package Cocktailbar;

public class Tisch extends Kasse {

    private final int tischnr;


    public Tisch(int tischnr){
        super(0,0,0);
        this.tischnr = tischnr;
    }

    public int getTischnr(){
        return tischnr;
    }

    public void zeigeTisch(){
        System.out.println("____________________________________________");
        System.out.println();
        System.out.println("Ihre Tischnummer ist: " + getTischnr());
    }
}
