import java.util.Arrays;

public class App {

    public byte[] encode(String decimalNumber) {

        // 1 - check number of digits (%2)
        int len = decimalNumber.length();
        byte[] result;
        int[] numbers;

        if (len % 2 > 0) { // Check if the length is odd
            result = new byte[len + 1]; // Initialize the array with extra space for odd lengths
            result[0] = '0';

            // x[0] = Integer.toBinaryString('0');

            numbers = new int[decimalNumber.length() + 1];
            numbers[0] = 0;
            System.out.printf("%d\n", decimalNumber.length());
            for (int i = 1; i < decimalNumber.length(); i++) {
                numbers[i] = Integer.parseInt(decimalNumber.substring(i, i + 1));
            }


            String[] binaryNumbers = new String[numbers.length];

            System.out.printf("%d\n", numbers.length);
            for (int i = 0; i < numbers.length; i++) {
                String binary = Integer.toBinaryString(numbers[i]);
                binary = String.format("%4s", binary).replace(' ', '0');    // Add leading zeros to make the binary string 4 bits long
                binaryNumbers[i] = binary;
            }
            
            // Print the binary numbers
            for (String binaryNumber : binaryNumbers) {
                System.out.println(binaryNumber);
            }

            // combine strings:
            System.out.println(binaryNumbers.length);
            String collect[] = new String[binaryNumbers.length/2];
            for (int j = 0; j < binaryNumbers.length; j += 2) {
                collect[j / 2] = binaryNumbers[j] + binaryNumbers[j + 1]; // Combine pairs into collect
            }

            // System.out.println(Arrays.toString(result));
            System.out.println(Arrays.toString(collect));

        } else {
            System.out.printf("wrong number\n");
            result = decimalNumber.getBytes(); // For even lengths, use the string's byte array directly
            // result = decimalNumber.toCharArray();
        }
        // System.out.printf("%d\n", result);
        // System.out.println(Arrays.toString(result));

        return result;

        

        // int[] intArray = new int[len];
        // for (int i = 0; i < len; i++) {
        //     intArray[i] = (int) decimalNumber.charAt(i) - '0';
        // }
        
        // byte[] encode = new byte[len];
        // for (int i = 0; i < len; i++) {
        // for (int i : result) {
        //     encode[i] = convertBinary();
        // }
        // return encode; // Return the byte array
    }
    
    // public String decode(byte[] bcdData) {
        
    // }
    
}
