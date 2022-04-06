package hoofstuk05;

public class FactorialCalculator {

    // 5 * 4 * 3 * 2 * 1
    // 0! = 1 * 1
    // Roep methode aan tot nummer de waarde 1 heeft en geeft waard terug

    int factorial(int number) {
        if( number > 1 ) {
            return number * (number - 1);
        }else {
            return number;
        }
    }
}
