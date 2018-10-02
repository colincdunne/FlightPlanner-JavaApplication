/**
 * Created by Colin on 15/11/2016.
 * Student ID: R00115734
 * Email: coln.c.dunne@mycit.ie
 */
public class CardChecker {
    private String cardNumber;

    CardChecker(String cN) {
        cardNumber = cN.replaceAll("\\s+", ""); //Deleting spaces from input
    }

    public String numberCheck() {
        //Checking if input is digits only, if not returns the below string.
        String test = "\\d+";
        if (cardNumber.matches(test) == false) {
            return "Invalid Input! Make Sure To Type Digits Only.";
        }
        else {
            //Using Luhn Algorithm to check if the digits entered are for a credit card.
            int oddNumbersSum = 0;
            int evenNumbersSum = 0;

            String reversedCardNumber = new StringBuffer(cardNumber).reverse().toString();
            for (int i = 0; i < reversedCardNumber.length(); i++) {
                int tempDigit = Character.digit(reversedCardNumber.charAt(i), 10);
                if (i % 2 == 0) {
                    oddNumbersSum += tempDigit;
                }
                else {
                    evenNumbersSum += (2 * tempDigit);
                    if (tempDigit >= 5) {
                        evenNumbersSum -= 9;
                    }
                }
            }

            if ((oddNumbersSum + evenNumbersSum) % 10 == 0) {
                return "CREDIT CARD NUMBER VALID!";
            }
            return "CREDIT CARD NUMBER INVALID!";
        }
    }
}