package hoofstuk05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HoofstukVijfTests {

    @Test
    void givenInteger_whenfactorial_returnFactorial() {

        FactorialCalculator factorialCalculator = new FactorialCalculator();

        int calculatedFactorial = factorialCalculator.factorial(5);

        Assertions.assertEquals(120,calculatedFactorial);
    }

    @Test
    void givenInteger6_whenRun_Return112358(){

        Fibo fibo = new Fibo();
        int testValue = 6;

        String result = fibo.run(testValue);

        assertThat(result).isEqualTo("1 1 2 3 5 8");
    }





}
