package hoofstuk05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HoofstukVijfTests {

    @Test
    void givenInteger_whenfactorial_returnFactorial() {

        FactorialCalculator factorialCalculator = new FactorialCalculator();

        int calculatedFactorial = factorialCalculator.factorial(5);

        Assertions.assertEquals(120,calculatedFactorial);
    }



}
