package stage6.hw18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
}

class TimeTest {
    @Test
    void noon() {
        Time noon = Time.noon();
        assertEquals(12, noon.hour);
        assertEquals(0, noon.minute);
        assertEquals(0, noon.second);
    }

    @Test
    void midnight() {
        Time midnight = Time.midnight();
        assertEquals(0, midnight.hour);
        assertEquals(0, midnight.minute);
        assertEquals(0, midnight.second);
    }

    @Test
    void ofSeconds() {
        Time time = Time.ofSeconds(500000);
        assertEquals(18, time.hour);
        assertEquals(53, time.minute);
        assertEquals(20, time.second);
    }
}
