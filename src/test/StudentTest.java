package test;

import org.junit.jupiter.api.Test;
import se.GroupAnimal.Student;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * En testklass för studentklassen
 *
 * @version	0.1 2024-01-26
 * @author	Johannes Randén
 */

class StudentTest {

    Student student;
    @Test
    void greet() {
        student = new Student("john", 19, 7);
        assertEquals(student.greet(), "Tjena");
    }
}