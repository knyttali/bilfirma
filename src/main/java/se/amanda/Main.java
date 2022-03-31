package se.amanda;

import java.lang.management.ClassLoadingMXBean;

import se.amanda.models.Bil;
import se.amanda.models.BilFirma;

public class Main {

    public static void main(String[] args) {

        BilFirma bilFirma = new BilFirma();
        bilFirma.addCar(new Bil("Blue", "Volvo"));
        bilFirma.addCar(new Bil("Green", "Saab"));
        bilFirma.addCar(new Bil("Gray", "Tesla"));
        System.out.println(bilFirma.toString());
    }
}
