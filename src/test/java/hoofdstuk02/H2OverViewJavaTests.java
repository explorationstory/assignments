package hoofdstuk02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.*;

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


        @Test
        void givenNoParam_whenPrintHelloWithParams_ThenHelloWorldReturned() {

            String message = assignmentsChapter2.printHelloWithParams(null);

            Assertions.assertEquals("Hello world",message);
        }

        @Test
        void scanInputFromCommandlineTest() {
            Scanner in = new Scanner(System.in);
            out.println("Enter username");
            String userName = in.nextLine();
            out.println("Username is: " + userName);
        }

        @Test
        void question7Test() {
            int plusTwo = abs(-2);
        }
}
