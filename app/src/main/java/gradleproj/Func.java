
package gradleproj;

public class Func {
    public byte[] encode(String decimalNumber) {
        // Check number of digits
        if (decimalNumber.length() % 2 > 0) {
            decimalNumber = "0" + decimalNumber;
        }

        int len = decimalNumber.length();
        byte[] result = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            int highNibble = Character.digit(decimalNumber.charAt(i), 10);
            int lowNibble = Character.digit(decimalNumber.charAt(i + 1), 10);
            result[i / 2] = (byte) ((highNibble << 4) | lowNibble);
        }

        return result;
    }

    public String decode(byte[] bcdData) {
        if (bcdData == null || bcdData.length == 0) {
            return "";
        }

        StringBuilder decodedNumber = new StringBuilder();
        for (byte b : bcdData) {
            int highNibble = (b >> 4) & 0xF;
            int lowNibble = b & 0xF;
            decodedNumber.append(highNibble).append(lowNibble);
        }

        if (decodedNumber.charAt(0) == '0') {
            decodedNumber.deleteCharAt(0);
        }

        return decodedNumber.toString();
    }
}
