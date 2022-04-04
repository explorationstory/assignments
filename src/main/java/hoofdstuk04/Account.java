package hoofdstuk04;

public class Account {
    public boolean validateAccountNumber(String accountNr) {
        return true;
    }


    public String stripDotsFromInputString(String accountNrWithDots) {

        StringBuilder accountNrWithOutDots = new StringBuilder();

        for(char c : accountNrWithDots.toCharArray()){
            if(c != '.') {
                accountNrWithOutDots.append(c);
            }
        }
        return accountNrWithOutDots.toString();
    }
}
