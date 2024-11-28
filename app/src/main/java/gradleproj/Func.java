
package gradleproj;

public class Func {
    public byte[] encode(String decimalNumber) {

        // Validate input
        if (decimalNumber == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        if (decimalNumber.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty.");
        }
        if (!decimalNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Input must contain only digits.");
        }

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

        // Validate input
        if (bcdData == null) {
            throw new IllegalArgumentException("Input BCD data cannot be null.");
        }
        if (bcdData.length == 0) {
            throw new IllegalArgumentException("Input BCD data cannot be empty.");
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
