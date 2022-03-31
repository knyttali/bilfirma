package se.amanda.models;

import java.util.ArrayList;

public class BilFirma {
    private ArrayList<Bil> bilar;

    public BilFirma() {
        this.bilar = new ArrayList<Bil>();
    }

    public ArrayList<Bil> getBilar() {
        return bilar;
    }

    public void setBilar(ArrayList<Bil> bilar) {
        this.bilar = bilar;
    }


    //-----------Metoder---------------------------

    public void sellCar(Bil bil) {
        this.bilar.remove(bil);
    }

    public void addCar(Bil bil) {
        this.bilar.add(new Bil(bil));
    }

    public boolean contains(Bil bil){
        return this.bilar.contains(bil);
    }

    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Bil bil : this.bilar) {
            temp.append(bil.toString());
            temp.append("\n\n");
        }
        return temp.toString();
    }


}
