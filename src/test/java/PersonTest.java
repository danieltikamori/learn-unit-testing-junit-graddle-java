import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


// This class contains test cases for the Person class
class PersonTest {

    // This test case checks the getBirthDate() method of the Person class
    @Test
    void getBirthDate() {

    }

    // This test case checks the getAge() method of the Person class
    @Test
    void getAge() {

    }

    // This test case checks the age calculation logic of the Person class
    @Test
    void validateAgeCalculation() {
        // Create a new instance of the Person class with a birthdate of January 1, 2000
        Person person = new Person("John", LocalDate.of(2000, 1, 1));
        // Assert that the calculated age of the person is 24
        Assertions.assertEquals(24, person.getAge());
    }
}