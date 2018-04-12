public class Calculator {

    public int getDecimalFromBinary(String binaryNumber) {
        int decimalNumber = 2;
        int powCounter = 0;
        int result = 0;
        int length = binaryNumber.length();

        while (length > 0) {
            if (binaryNumber.substring(length - 1).equals("1")) {
                result += ((int) Math.pow(decimalNumber, powCounter));
            } else if (binaryNumber.substring(length).equals("0")) {
                result += 0;
            }
            powCounter++;
            binaryNumber = binaryNumber.substring(0, length - 1);
            length--;
        }
        return result;
    }

    public long getDecimalFromHex(String hexNumber) {
        int hex = 16;
        int counter = 0;
        int result = 0;
        int length = hexNumber.length();

        while (length > 0) {
            if (hexNumber.substring(length - 1).equals("0")) {
                result += 0;
            }
            else if (hexNumber.substring(length - 1).equals("1")) {
                result += Math.pow(hex, counter);
            }
            else if (hexNumber.substring(length - 1).equals("2")) {
                result += (2 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("3")) {
                result += (3 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("4")) {
                result += (4 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("5")) {
                result += (5 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("6")) {
                result += (6 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("7")) {
                result += (7 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("8")) {
                result += (8 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("9")) {
                result += (9 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("A")) {
                result += (10 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("B")) {
                result += (11 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("C")) {
                result += (12 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("D")) {
                result += (13 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("E")) {
                result += (14 * (Math.pow(hex, counter)));
            }
            else if (hexNumber.substring(length - 1).equals("F")) {
                result += (15 * (Math.pow(hex, counter)));
            }

            hexNumber=hexNumber.substring(0,length-1);
            counter++;
            length--;
        }
        return result;
    }
    public String getBinaryFromDecimal(int decimalNumber){
        String adddedToResult="";
        String result="";

        return result;
    }
}