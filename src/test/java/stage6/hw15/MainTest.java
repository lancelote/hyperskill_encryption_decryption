package stage6.hw15;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
}

class TakePersonsWithStepAlgorithmTest {
    @Test
    void select() {
        Person[] persons = {
                new Person("user1"),
                new Person("user2"),
                new Person("user3"),
        };
        Person[] expected = {
                new Person("user1"),
                new Person("user3"),
        };
        TakePersonsWithStepAlgorithm algorithm = new TakePersonsWithStepAlgorithm(2);
        assertArrayEquals(expected, algorithm.select(persons));
    }
}

class TakeLastPersonsAlgorithmTest {
    @Test
    void select() {
        Person[] persons = {
                new Person("user1"),
                new Person("user2"),
                new Person("user3"),
        };
        Person[] expected = {
                new Person("user2"),
                new Person("user3"),
        };
        TakeLastPersonsAlgorithm algorithm = new TakeLastPersonsAlgorithm(2);
        assertArrayEquals(expected, algorithm.select(persons));
    }
}
