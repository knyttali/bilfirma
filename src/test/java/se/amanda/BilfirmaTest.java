package se.amanda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import se.amanda.models.Bil;
import se.amanda.models.BilFirma;


public class BilfirmaTest {

    private BilFirma bilFirma;

    @BeforeEach
    public void setup(){
        bilFirma = new BilFirma();
        bilFirma.addCar(new Bil("Blue", "Volvo"));
        bilFirma.addCar(new Bil("Green", "Saab"));
        bilFirma.addCar(new Bil("Gray", "Tesla"));
    }

    @DisplayName("Lägg till bil till utbudet")
    @Test
    public void testAddedCar() {
        Assertions.assertTrue(bilFirma.getBilar().get(0).equals(new Bil("Blue", "Volvo")));
    }

    @DisplayName("Ta bort bil från utbudet")
    @Test
    public void testIfCarSold() {
        bilFirma.sellCar(bilFirma.getBilar().get(0));
        Assertions.assertFalse(bilFirma.getBilar().contains(new Bil("Blue", "Volvo")));
    }
}
