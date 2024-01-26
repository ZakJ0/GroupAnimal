package test;

import org.junit.jupiter.api.Test;
import se.GroupAnimal.Computer;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    @Test
    void testCalculateMonthlyPayment() {
        Computer computer = new Computer("BrandX", "ModelY", 2022, 1000.0);

        double monthlyPayment = computer.calculateMonthlyPayment();

        assertEquals(10.0, monthlyPayment, 0.01);
    }

    @Test
    void testCalcualteDeductable() {

        Computer computer = new Computer("BrandX", "ModelY", 2022, 1000.0);


        double deductible = computer.calcualteDeductable();


        assertEquals(50.0, deductible, 0.01);
    }

    @Test
    void testToString() {

        Computer computer = new Computer("BrandX", "ModelY", 2022, 1000.0);


        String toStringResult = computer.toString();


        assertEquals("Computer{brand='BrandX', model='ModelY', yearOfManufacture=2022, purchasePrice=1000.0}", toStringResult);
    }

    @Test
    void testSettersAndGetters() {

        Computer computer = new Computer("BrandX", "ModelY", 2022, 1000.0);


        computer.setBrand("BrandNew");
        computer.setModel("ModelNew");
        computer.setYearOfManufacture(2023);
        computer.setPurchasePrice(1500.0);

        assertEquals("BrandNew", computer.getBrand());
        assertEquals("ModelNew", computer.getModel());
        assertEquals(2023, computer.getYearOfManufacture());
        assertEquals(1500.0, computer.getPurchasePrice(), 0.01);
    }
}
