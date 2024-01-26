package test;

import org.junit.jupiter.api.Test;
import se.GroupAnimal.Senior;

import static org.junit.jupiter.api.Assertions.*;

public class SeniorTest {

    @Test
    void testGetName() {

        Senior senior = new Senior("John", 65, "Male", true);


        String name = senior.getName();


        assertEquals("John", name);
    }

    @Test
    void testSetName() {

        Senior senior = new Senior("John", 65, "Male", true);

        senior.setName("Alice");

        assertEquals("Alice", senior.getName());
    }

    @Test
    void testGetAge() {
        Senior senior = new Senior("John", 65, "Male", true);

        int age = senior.getAge();

        assertEquals(65, age);
    }

    @Test
    void testSetAge() {
        Senior senior = new Senior("John", 65, "Male", true);

        senior.setAge(70);

        assertEquals(70, senior.getAge());
    }

    @Test
    void testGetGender() {
        Senior senior = new Senior("John", 65, "Male", true);

        String gender = senior.getGender();

        assertEquals("Male", gender);
    }

    @Test
    void testSetGender() {
        Senior senior = new Senior("John", 65, "Male", true);

        senior.setGender("Female");

        assertEquals("Female", senior.getGender());
    }

    @Test
    void testIsRetired() {
        Senior senior = new Senior("John", 65, "Male", true);

        boolean isRetired = senior.isRetired();

        assertTrue(isRetired);
    }

    @Test
    void testSetRetired() {
        Senior senior = new Senior("John", 65, "Male", true);

        senior.setRetired(false);

        assertFalse(senior.isRetired());
    }

    @Test
    void testToString() {
        Senior senior = new Senior("John", 65, "Male", true);

        String toStringResult = senior.toString();

        assertEquals("Senior{name='John', age=65, Gender='Male', isRetired=true}", toStringResult);
    }
}