package hoofdstuk06;

import org.junit.jupiter.api.Test;

public class ArrayTests {

    // Vraag 1
    @Test
    void vraag1() {

        long[] row = new long[4];  // Long array met grootte 4
        row[2] = 3;                // { , ,3, }
        long[] copy = row;         // copy wijst naar row adres
        copy[2]++;                 // { , ,4, }

        // what is value of row[4]?
        // indexnr bestaat niet dus ouToFBoundsArray exception?!?

        System.out.println(row[4]);
    }

}
