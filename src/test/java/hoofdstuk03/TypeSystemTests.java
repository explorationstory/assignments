package hoofdstuk03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.time.LocalTime;

public class TypeSystemTests {

    @Test
    @DisplayName("Exploring pre and post increment")
    void preIncrementPostIncrementTest() {

        int a = 0;

        // Eerst wordt de huidige waarde opgehaald en dan 1 opgeteld
        System.out.println(a++); // a = 0
                                // a = 1, wordt hier pas opgeteld
        int b = 0;
        //Eerst wordt 1 opgeteld dan wordt waarde teruggeven;
        System.out.println(++b); // b = 1

        // ++10 kan niet

    }

    @Test
    @DisplayName("Vraag 1 en 2")
    void calculateResultOfJ(){

        // >>> unsigned right bit-shift operator. Delen door de macht van de rechter operand
        int i = 3;

        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println(j);
    }

    @Test
    @DisplayName("Vraag 3")
    void resultOfBinarySum() {

        int sum1 = 0b1010;

        int sum2 = 0b100;

        int total = sum1 + sum2;

        Assertions.assertEquals(14,total);

        System.out.println(total);
    }

    @Test
    void giveNumberOfHours_whenCalculateTime_thenReturnCorrectTime() {

        TimeCalculator timeCalculator = new TimeCalculator();

        LocalTime time = timeCalculator.calculateTimeAfter(80);

        System.out.println(time);

        Assertions.assertEquals(LocalTime.of(7,00),time);

    }
}
