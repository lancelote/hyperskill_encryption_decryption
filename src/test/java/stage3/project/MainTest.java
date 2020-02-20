package stage3.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void testEncrypt() {
        assertEquals(Main.encrypt("Welcome to hyperskill!", 5), "\\jqhtrj%yt%m~ujwxpnqq&");
    }

    @Test
    void testDecrypt() {
        assertEquals(Main.decipher("\\jqhtrj%yt%m~ujwxpnqq&", 5), "Welcome to hyperskill!");
    }
}
