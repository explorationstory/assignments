package hoofdstuk04;

import org.junit.jupiter.api.Test;

public class HourGlassFigureTest {

    @Test
    void printHourGlassFigureTestWithNIs9() {
        System.out.println(" 123456789");
        System.out.println("1*********");
        System.out.println("2 *     *");
        System.out.println("3  *   *");
        System.out.println("4   * *");
        System.out.println("5    *");
        System.out.println("6   * *");
        System.out.println("7  *   *");
        System.out.println("8 *     *");
        System.out.println("9*********");
    }

    @Test
    void printNRows() {
        int n = 9;
        for(int row = 1;row<= n; row++) {

            for(int col = 1;col<= n;col++) {
                if( row == 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    @Test
    void printBottomRow() {
        for(int row = 1;row <= 9;row++) {

            for(int col = 1; col <= 9;col++) {
                if( row == 9){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
