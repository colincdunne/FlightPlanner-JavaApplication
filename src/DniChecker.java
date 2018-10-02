import static java.lang.Integer.parseInt;

/**
 * Created by Colin on 15/11/2016.
 * Student ID: R00115734
 * Email: coln.c.dunne@mycit.ie
 */
public class DniChecker {

    private String dniNumber;
    private String dniNum;
    private String dniNumCopy;
    private int num;
    private int dnimod = 0;
    private String dniletter;
    private String dniletter2;
    private String madstring;

    DniChecker(String cN) {
        dniNumber = cN.replaceAll("\\s+", ""); //Deleting spaces from input
    }

    public String dniNumCheck() {
        dniNumCopy = dniNumber;

        if (!(dniNumCopy.length() == 10 || dniNumCopy.length() == 9)) {
            return "Invalid Input! Make sure DNI is 9 or 10 Characters Long!";
        }

        if (dniNumCopy.length() == 10) {
            if(dniNumber.charAt(8) == '-') {
                dniNumCopy = dniNumber.substring(0, 8) + dniNumber.substring(9, 10);
            }
            else {
                return "Invalid Input! Make sure DNI is 9 or 10 Characters Long!";
            }
        }

        num = 10;
        num = parseInt(dniNumCopy.substring(0,8), 10);

        dniletter = dniNumCopy.substring(8,9);
        dniletter = dniletter.toUpperCase();

        dnimod = num % 23;

        madstring ="TRWAGMYFPDXBNJZSQVHLCKE";
        dniletter2 = madstring.substring(dnimod);

        if(!dniletter.equals(dniletter2)) {
            return "TRUE";
        }
        return "FALSE";
    }
}