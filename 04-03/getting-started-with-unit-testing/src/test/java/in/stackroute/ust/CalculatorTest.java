package in.stackroute.ust;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calculator;
    private int sumActual;
    private int expected;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up the test");
        calculator = new Calculator();
        sumActual = 0;
        expected = 0;
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down the test");
        calculator = null;
        sumActual = 0;
        expected = 0;
        System.out.println();
    }

    @Test
    @DisplayName("Test add with positive numbers")
    void testAddWithPositiveNumbers() {
        System.out.println("Test add with positive numbers");
        int sumActual = calculator.add(10, 20);
        int expected = 30;
        Assertions.assertEquals(expected, sumActual);
    }

    @Test
    @DisplayName("Test add with negative numbers")
    void testAddWithNegativeNumbers() {
        System.out.println("Test add with negative numbers");
        int sumActual = calculator.add(-10, -20);
        int expected = -30;
        Assertions.assertEquals(expected, sumActual);
    }

    @Test
    @DisplayName("Test Multiply with positive numbers")
    void testMultiplyWithPositiveNumbers() {
        System.out.println("Test multiply with positive numbers");
        int productActual = calculator.multiply(10, 20);
        int expected = 200;
        Assertions.assertEquals(expected, productActual);
    }

    @Test
    @DisplayName("Test multiply with negative numbers")
    void testMultiplyWithNegativeNumbers() {
        System.out.println("Test multiply with negative numbers");
        int productActual = calculator.multiply(-10, 20);
        int expected = -200;
        Assertions.assertEquals(expected, productActual);
    }

    @Test
    @DisplayName("Test add with Zero")
    void testMultiplyWithZero() {
        System.out.println("Test multiply with 0");
        int productActual = calculator.multiply(0,20);
        int expected = 0;
        Assertions.assertEquals(expected, productActual);
    }
}
