package hoofdstuk04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class H4StatementsAndExceptionTests {

    @Test
    @DisplayName("Vraag 1")
    void givenValidAccountNumber_whenValidate_thenTrueReturned() {

        Account account = new Account();

        boolean isValid = account.validateAccountNumber("73.61.60.221");

        Assertions.assertEquals(true,isValid);
    }

    @Test
    void givenAccountNumber_whenStripDotsFromString_thenNumberWithoutDotsReturned() {

        Account account = new Account();

        String accountNr = account.stripDotsFromInputString("73.61.60.221");

        Assertions.assertEquals("736160221",accountNr);

    }
}
