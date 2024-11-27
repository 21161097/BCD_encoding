
public class App {

    public byte[] encode(String decimalNumber) {

        // int[] numbers;
        // String[] binaryNumbers;
        // String collect[];

        // Check number of digits
        System.out.printf("initial length: %d\n", decimalNumber.length());
        if (decimalNumber.length() % 2 > 0) {
            decimalNumber = "0" + decimalNumber;
        }

        int len = decimalNumber.length();
        System.out.printf("updated length: %d\n", len);
        byte[] result = new byte[len / 2];

        for (int i = 0; i < len; i += 2) {
            int highNibble = Character.digit(decimalNumber.charAt(i), 10);      // First digit
            int lowNibble = Character.digit(decimalNumber.charAt(i + 1), 10);   // Second digit
            result[i / 2] = (byte) ((highNibble << 4) | lowNibble);             // Combine nibbles
        }

        System.out.println("BCD Encoded Bytes:");
        for (byte b : result) {
            System.out.println(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
        }


        // if (len % 2 > 0) { // Check if the length is odd
        //     // Add a starting "0" - save each number in an int array
        //     numbers = new int[len + 1];
        //     numbers[0] = 0;     // Add the leading 0
        //     for (int i = 0; i < len; i++) {
        //         numbers[i + 1] = Integer.parseInt(decimalNumber.substring(i, i + 1));   // Offset by 1
        //     }
        //     System.out.printf("updated length: %d\n", numbers.length);

        // } else {
        //     System.out.printf("even number\n");
        //     numbers = new int[len];
        //     for (int i = 0; i < len; i++) {
        //         numbers[i] = Integer.parseInt(decimalNumber.substring(i, i + 1));
        //     }
        // }

        // // Convert int numbers to binary - keep as 4 digits - save in String array
        // binaryNumbers = new String[numbers.length];
        // for (int i = 0; i < numbers.length; i++) {
        //     String binary = Integer.toBinaryString(numbers[i]);
        //     binary = String.format("%4s", binary).replace(' ', '0');    // Add leading zeros to make the binary string 4 bits long
        //     binaryNumbers[i] = binary;
        // }

        // // Print the binary numbers - debugging
        // System.out.printf("binary values: ");
        // for (String binaryNumber : binaryNumbers) { 
        //     System.out.print(binaryNumber + ", "); 
        // }
        // System.out.print("\n"); 

        // // Combine strings in pairs
        // collect = new String[binaryNumbers.length/2];
        // for (int j = 0; j < binaryNumbers.length; j += 2) {
        //     collect[j / 2] = binaryNumbers[j] + binaryNumbers[j + 1];   // Combine pairs into collect
        // }
        // // System.out.printf("combined values: ");
        // // System.out.println(Arrays.toString(collect));


        // ---

        // String[] binaryStrings = {"01010101", "00000101", "00010101", "01000101"};
        // byte[] bytes = new byte[binaryStrings.length];
        // for (int i = 0; i < binaryStrings.length; i++) {
        //     // bytes[i] = Byte.parseByte(binaryStrings[i], 2);
        //     bytes[i] = (byte) Integer.parseInt(binaryStrings[i], 2);
        // }
        
        // System.out.printf("bytes: ");
        // for (int i = 0; i < bytes.length; i++) {
        //     System.out.println(Integer.toBinaryString(bytes[i]));
        //     System.out.println(bytes[i]);
        // }
        // System.out.println(Arrays.toString(bytes));

        // ---

        // result = new byte[collect.length]; // Initialize the array with extra space for odd lengths
        // // convert collect to "result"
        // for (int i = 0; i < collect.length; i++) {
        //     result[i] = collect[i].getBytes()[0];
        // }

        // byte[] byteArray = new byte[collect.length];
        // for (int i = 0; i < collect.length; i++) {
        //     byteArray[i] = collect[i].getBytes()[0];
        // }
        // System.out.println(Arrays.toString(byteArray));

        // byte[] byteArray2 = new byte[collect.length];
        // for (int i = 0; i < collect.length; i++) {
        //     byteArray2[i] = (byte) Integer.parseInt(collect[i], 2);
        // }
        // System.out.println(Arrays.toString(byteArray2));

        // byte[] byteArray1 = new byte[collect.length];
        // for (int i = 0; i < collect.length; i++) {
        //     byteArray1[i] = Byte.parseByte(collect[i], 2);
        // }
        // System.out.println(Arrays.toString(byteArray1));
       

        // System.out.printf("%d\n", result);
        // System.out.println(Arrays.toString(result));

        return result;

    }
    

    public String decode(byte[] bcdData) {
        String result = "";


        // split bytes into nibbles
        // convert binary nibbles into decimal strings
        // check for and remove initial "0"


        return result;
    }
    
}
