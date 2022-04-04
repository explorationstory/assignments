package hoofdstuk04;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Account {
    public boolean validateAccountNumber(String accountNr) {
        boolean isValid = false;

          List<Character> accountNrArray = stripDotsFromInputString(accountNr);

        int sum = 0;
        int controlnumber = 9;

        for (char c :
                accountNrArray) {
            sum+= controlnumber * Character.getNumericValue(c);
            System.out.println(sum);
            controlnumber--;
        }

        if(isDivisibleBy11(sum)){
            isValid = true;
        }

        return isValid;

    }

    public boolean isDivisibleBy11(int number) {

        boolean isDivisibleBy11 = number % 11 == 0;

        return isDivisibleBy11;
    }


    public List<Character> stripDotsFromInputString(String accountNrWithDots) {

        List<Character> charArray = new ArrayList<>();

        for(char c : accountNrWithDots.toCharArray()){
            if(c != '.') {
                charArray.add(c);
            }
        }

        return charArray;
    }
}
