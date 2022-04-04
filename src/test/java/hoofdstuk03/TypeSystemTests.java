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
    @DisplayName("Vraag 4")
    void giveNumberOfHours_whenCalculateTime_thenReturnCorrectTime() {

        TimeCalculator timeCalculator = new TimeCalculator();

        LocalTime time = timeCalculator.calculateTimeAfter(LocalTime.of(23,00),80);

        System.out.println(time);

        Assertions.assertEquals(LocalTime.of(7,00),time);

    }

    @Test
    @DisplayName("Vraag 4")
    void givenNumberOfHours_whenDetermineDays_thenNumberOfDaysReturned() {

        TimeCalculator timeCalculator = new TimeCalculator();

        int numberOfDays = timeCalculator.determineDays(LocalTime.of(23, 00), 80);

        Assertions.assertEquals(3, numberOfDays);

    }

    @Test
    @DisplayName("Vraag 5")
    void givenMinOrMaxCondition_whenGetByteRangeValue_thenRangeLimitReturned() {

        ValueRanges valueRanges = new ValueRanges();

        int minimumValue = valueRanges.getByteRangeValue("Min");

        int maximumValue = valueRanges.getByteRangeValue("max");

        Assertions.assertEquals(-128,minimumValue);

        Assertions.assertEquals(127,maximumValue);

    }

    @Test
    @DisplayName("Vraag 6")
    void clientsNameAfterAssigningReferenceTypesTest() {

        //Twee adressen naar een locatie in geheugen van String objecten

        hoofdstuk03.Client client1 = new hoofdstuk03.Client("Jan");
        hoofdstuk03.Client client2 = new hoofdstuk03.Client("Piet");

        // Adres client 2 wijst nu naar client 1 adres, dus client2.naam wordt Jan
        client2 = client1;

        // name client 1 wordt nu "Joris", beide variabelen wijzen naar hetzelfde adres

        client2.name = "Joris";

        System.out.println(client1.name);


    }
}
