package test;

import org.junit.jupiter.api.Test;
import se.GroupAnimal.Wolf;

import static org.junit.jupiter.api.Assertions.*;
/**
 * En testklass för wolfklassen
 *
 * @version	0.1 2024-01-26
 * @author	Johannes Randén
 */

class WolfTest {
    Wolf wolf;

    @Test
    void makeSoundTest(){
        wolf = new Wolf("bert", 5, "skåne");
        assertEquals(wolf.makeSound(), "Awooooooo");
    }

}