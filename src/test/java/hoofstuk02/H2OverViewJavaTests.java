package hoofstuk02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class H2OverViewJavaTests {

    AssignmentsChapter2 assignmentsChapter2;

    @BeforeEach
    void setUp() {
        assignmentsChapter2 = new AssignmentsChapter2();
    }

    @Test
        void helloWorldToConsoleTest() {

            String message = assignmentsChapter2.printHelloWorld("Hello world");

            Assertions.assertEquals("Hello world",message);
        }

        @Test
        void givenName_whenPrintHelloWithParams_thenHelloWithNameReturned() {

            String message = assignmentsChapter2.printHelloWithParams("Jamie");

            Assertions.assertEquals("Hello Jamie",message);
        }
}
