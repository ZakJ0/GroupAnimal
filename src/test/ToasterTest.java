package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.GroupAnimal.Toaster;

import static org.junit.jupiter.api.Assertions.*;
/**
 * En testklass för toasterklassen
 *
 * @version	0.1 2024-01-26
 * @author	Johannes Randén
 */

class ToasterTest {
    Toaster toaster;

    @BeforeEach
    void setUp(){
        toaster = new Toaster("electroluks", 500, 6);
    }

    @Test
    void calculateMonthlyPayment() {
        assertEquals(toaster.calculateMonthlyPayment(), 50);
    }

    @Test
    void calcualteDeductable() {
        assertEquals(toaster.calcualteDeductable(), 250);
    }
}