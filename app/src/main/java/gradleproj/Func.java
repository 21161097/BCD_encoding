

package gradleproj;

public class Func {
    public byte[] encode(String decimalNumber) {
        // Check number of digits
        System.out.printf("initial length: %d\n", decimalNumber.length());
        if (decimalNumber.length() % 2 > 0) {
            decimalNumber = "0" + decimalNumber;
        }

        int len = decimalNumber.length();
        System.out.printf("updated length: %d\n", len);
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



// package gradleproj;

// class func {
//     public byte[] encode(String decimalNumber) {
//         // Check number of digits
//         System.out.printf("initial length: %d\n", decimalNumber.length());
//         if (decimalNumber.length() % 2 > 0) {
//             decimalNumber = "0" + decimalNumber;
//         }

//         int len = decimalNumber.length();
//         System.out.printf("updated length: %d\n", len);
//         byte[] result = new byte[len / 2];

//         for (int i = 0; i < len; i += 2) {
//             int highNibble = Character.digit(decimalNumber.charAt(i), 10);
//             int lowNibble = Character.digit(decimalNumber.charAt(i + 1), 10);
//             result[i / 2] = (byte) ((highNibble << 4) | lowNibble);
//         }

//         return result;
//     }

//     public String decode(byte[] bcdData) {
//         if (bcdData == null || bcdData.length == 0) {
//             return "";
//         }

//         StringBuilder decodedNumber = new StringBuilder();
//         for (byte b : bcdData) {
//             int highNibble = (b >> 4) & 0xF;
//             int lowNibble = b & 0xF;
//             decodedNumber.append(highNibble).append(lowNibble);
//         }

//         if (decodedNumber.charAt(0) == '0') {
//             decodedNumber.deleteCharAt(0);
//         }

//         return decodedNumber.toString();
//     }
// }




// package gradleproj;

// public class Func {
//     public byte[] encode(String decimalNumber) {
//         // Check number of digits
//         System.out.printf("initial length: %d\n", decimalNumber.length());
//         if (decimalNumber.length() % 2 > 0) {
//             decimalNumber = "0" + decimalNumber;
//         }

//         int len = decimalNumber.length();
//         System.out.printf("updated length: %d\n", len);
//         byte[] result = new byte[len / 2];

//         for (int i = 0; i < len; i += 2) {
//             int highNibble = Character.digit(decimalNumber.charAt(i), 10);      // First digit
//             int lowNibble = Character.digit(decimalNumber.charAt(i + 1), 10);   // Second digit
//             result[i / 2] = (byte) ((highNibble << 4) | lowNibble);             // Combine nibbles
//         }

//         return result;
//     }

//     public String decode(byte[] bcdData) {
//         // Separate bytes into nibbles
//         StringBuilder decodedNumber = new StringBuilder();
//         for (byte b : bcdData) {
//             int highNibble = (b >> 4) & 0xF; // Extract high nibble
//             int lowNibble = b & 0xF;         // Extract low nibble
//             decodedNumber.append(highNibble).append(lowNibble);
//         }

//         // Check for and remove initial "0"
//         if (decodedNumber.charAt(0) == '0') {
//             decodedNumber.deleteCharAt(0);
//         }

//         return decodedNumber.toString();
//     }
// }
    