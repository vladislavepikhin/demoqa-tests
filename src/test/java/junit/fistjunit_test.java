package junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class fistjunit_test {
    @AfterAll
    static void afterall() {
        System.out.println("TEST AFTER ALL");
    }
    @Test
    void JUinitTest() {
        Assertions.assertTrue(3 > 2);
    }
}
