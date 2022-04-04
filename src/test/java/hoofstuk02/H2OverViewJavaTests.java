package hoofstuk02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class H2OverViewJavaTests {

        @Test
        void helloWorldToConsoleTest() {

            AssignmentsChapter2 assignmentsChapter2 = new AssignmentsChapter2();

            String message = assignmentsChapter2.printHelloWorld("Hello world");

            Assertions.assertEquals("Hello world",message);
        }
}
