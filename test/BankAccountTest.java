import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {


    @Test
    void testDeposit1() {

    }

    @Test
    void exampleFloat() {
        double num1 = 0.1;
        double num2 = 0.2;
        double delta = 0.00000001;

        assertEquals(0.3, num1 + num2, delta);
    }
}