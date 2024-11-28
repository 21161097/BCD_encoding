


package gradleproj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncTest {

    @Test
    public void testEncode() {
        Func f = new Func();

        // Test case 1: Encode a regular number
        String input1 = "1234";
        byte[] expectedOutput1 = new byte[]{0x12, 0x34};
        byte[] actualOutput1 = f.encode(input1);
        assertArrayEquals(expectedOutput1, actualOutput1, "Encoding failed for input: " + input1);

        // Test case 2: Encode a number with an odd number of digits
        String input2 = "99999";
        byte[] expectedOutput2 = new byte[]{0x09, (byte) 0x99, (byte) 0x99};
        byte[] actualOutput2 = f.encode(input2);
        assertArrayEquals(expectedOutput2, actualOutput2, "Encoding failed for input: " + input2);

        // Test case 3: Encode a single digit
        String input3 = "7";
        byte[] expectedOutput3 = new byte[]{0x07};
        byte[] actualOutput3 = f.encode(input3);
        assertArrayEquals(expectedOutput3, actualOutput3, "Encoding failed for input: " + input3);

        // Test case 4: Encode an empty string
        String input4 = "";
        byte[] expectedOutput4 = new byte[]{};
        byte[] actualOutput4 = f.encode(input4);
        assertArrayEquals(expectedOutput4, actualOutput4, "Encoding failed for input: " + input4);
    }

    @Test
    public void testDecode() {
        Func f = new Func();

        // Test case 1: Decode a regular BCD encoded byte array
        byte[] input1 = new byte[]{0x12, 0x34};
        String expectedOutput1 = "1234";
        String actualOutput1 = f.decode(input1);
        assertEquals(expectedOutput1, actualOutput1, "Decoding failed for input: " + byteArrayToString(input1));

        // Test case 2: Decode a BCD encoded byte array with an initial "0"
        byte[] input2 = new byte[]{0x09, (byte) 0x99, (byte) 0x99};
        String expectedOutput2 = "99999";
        String actualOutput2 = f.decode(input2);
        assertEquals(expectedOutput2, actualOutput2, "Decoding failed for input: " + byteArrayToString(input2));

        // Test case 3: Decode a single digit BCD encoded byte array
        byte[] input3 = new byte[]{0x07};
        String expectedOutput3 = "7";
        String actualOutput3 = f.decode(input3);
        assertEquals(expectedOutput3, actualOutput3, "Decoding failed for input: " + byteArrayToString(input3));

        // Test case 4: Decode an empty BCD encoded byte array
        byte[] input4 = new byte[]{};
        String expectedOutput4 = "";
        String actualOutput4 = f.decode(input4);
        assertEquals(expectedOutput4, actualOutput4, "Decoding failed for input: " + byteArrayToString(input4));
    }

    private String byteArrayToString(byte[] byteArray) {
        StringBuilder sb = new StringBuilder();
        for (byte b : byteArray) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }
}


// package gradleproj;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertArrayEquals;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// public class FuncTest {

//     @Test
//     public void testEncode() {
//         Func f = new Func();

//         // Test case 1: Encode a regular number
//         String input1 = "1234";
//         byte[] expectedOutput1 = new byte[]{0x12, 0x34};
//         byte[] actualOutput1 = f.encode(input1);
//         assertArrayEquals(expectedOutput1, actualOutput1, "Encoding failed for input: " + input1);

//         // Test case 2: Encode a number with an odd number of digits
//         String input2 = "99999";
//         byte[] expectedOutput2 = new byte[]{0x09, (byte) 0x99, (byte) 0x99};
//         byte[] actualOutput2 = f.encode(input2);
//         assertArrayEquals(expectedOutput2, actualOutput2, "Encoding failed for input: " + input2);

//         // Test case 3: Encode a single digit
//         String input3 = "7";
//         byte[] expectedOutput3 = new byte[]{0x07};
//         byte[] actualOutput3 = f.encode(input3);
//         assertArrayEquals(expectedOutput3, actualOutput3, "Encoding failed for input: " + input3);

//         // Test case 4: Encode an empty string
//         String input4 = "";
//         byte[] expectedOutput4 = new byte[]{};
//         byte[] actualOutput4 = f.encode(input4);
//         assertArrayEquals(expectedOutput4, actualOutput4, "Encoding failed for input: " + input4);
//     }

//     @Test
//     public void testDecode() {
//         Func f = new Func();

//         // Test case 1: Decode a regular BCD encoded byte array
//         byte[] input1 = new byte[]{0x12, 0x34};
//         String expectedOutput1 = "1234";
//         String actualOutput1 = f.decode(input1);
//         assertEquals(expectedOutput1, actualOutput1, "Decoding failed for input: " + byteArrayToString(input1));

//         // Test case 2: Decode a BCD encoded byte array with an initial "0"
//         byte[] input2 = new byte[]{0x09, (byte) 0x99, (byte) 0x99};
//         String expectedOutput2 = "99999";
//         String actualOutput2 = f.decode(input2);
//         assertEquals(expectedOutput2, actualOutput2, "Decoding failed for input: " + byteArrayToString(input2));

//         // Test case 3: Decode a single digit BCD encoded byte array
//         byte[] input3 = new byte[]{0x07};
//         String expectedOutput3 = "7";
//         String actualOutput3 = f.decode(input3);
//         assertEquals(expectedOutput3, actualOutput3, "Decoding failed for input: " + byteArrayToString(input3));

//         // Test case 4: Decode an empty BCD encoded byte array
//         byte[] input4 = new byte[]{};
//         String expectedOutput4 = "";
//         String actualOutput4 = f.decode(input4);
//         assertEquals(expectedOutput4, actualOutput4, "Decoding failed for input: " + byteArrayToString(input4));
//     }

//     private String byteArrayToString(byte[] byteArray) {
//         StringBuilder sb = new StringBuilder();
//         for (byte b : byteArray) {
//             sb.append(String.format("%02X", b));
//         }
//         return sb.toString();
//     }
// }




// package gradleproj;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertArrayEquals;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// public class FuncTest {

//     @Test
//     public void testEncode() {
//         Func f = new Func();

//         // Test case 1: Encode a regular number
//         String input1 = "1234";
//         byte[] expectedOutput1 = new byte[]{0x12, 0x34};
//         byte[] actualOutput1 = f.encode(input1);
//         assertArrayEquals(expectedOutput1, actualOutput1, "Encoding failed for input: " + input1);

//         // Test case 2: Encode a number with an odd number of digits
//         String input2 = "99999";
//         byte[] expectedOutput2 = new byte[]{0x09, (byte) 0x99, (byte) 0x99};
//         byte[] actualOutput2 = f.encode(input2);
//         assertArrayEquals(expectedOutput2, actualOutput2, "Encoding failed for input: " + input2);

//         // Test case 3: Encode a single digit
//         String input3 = "7";
//         byte[] expectedOutput3 = new byte[]{0x07};
//         byte[] actualOutput3 = f.encode(input3);
//         assertArrayEquals(expectedOutput3, actualOutput3, "Encoding failed for input: " + input3);

//         // Test case 4: Encode an empty string
//         String input4 = "";
//         byte[] expectedOutput4 = new byte[]{};
//         byte[] actualOutput4 = f.encode(input4);
//         assertArrayEquals(expectedOutput4, actualOutput4, "Encoding failed for input: " + input4);
//     }

//     @Test
//     public void testDecode() {
//         Func f = new Func();

//         // Test case 1: Decode a regular BCD encoded byte array
//         byte[] input1 = new byte[]{0x12, 0x34};
//         String expectedOutput1 = "1234";
//         String actualOutput1 = f.decode(input1);
//         assertEquals(expectedOutput1, actualOutput1, "Decoding failed for input: " + byteArrayToString(input1));

//         // Test case 2: Decode a BCD encoded byte array with an initial "0"
//         byte[] input2 = new byte[]{0x09, (byte) 0x99, (byte) 0x99};
//         String expectedOutput2 = "99999";
//         String actualOutput2 = f.decode(input2);
//         assertEquals(expectedOutput2, actualOutput2, "Decoding failed for input: " + byteArrayToString(input2));

//         // Test case 3: Decode a single digit BCD encoded byte array
//         byte[] input3 = new byte[]{0x07};
//         String expectedOutput3 = "7";
//         String actualOutput3 = f.decode(input3);
//         assertEquals(expectedOutput3, actualOutput3, "Decoding failed for input: " + byteArrayToString(input3));

//         // Test case 4: Decode an empty BCD encoded byte array
//         byte[] input4 = new byte[]{};
//         String expectedOutput4 = "";
//         String actualOutput4 = f.decode(input4);
//         assertEquals(expectedOutput4, actualOutput4, "Decoding failed for input: " + byteArrayToString(input4));
//     }

//     private String byteArrayToString(byte[] byteArray) {
//         StringBuilder sb = new StringBuilder();
//         for (byte b : byteArray) {
//             sb.append(String.format("%02X", b));
//         }
//         return sb.toString();
//     }
// }









// package gradleproj;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertArrayEquals;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// public class FuncTest {

//     @Test
//     public void testEncode() {
//         Func f = new Func();

//         // Test case 1: Encode a regular number
//         String input1 = "1234";
//         byte[] expectedOutput1 = new byte[]{0x12, 0x34};
//         byte[] actualOutput1 = f.encode(input1);
//         assertArrayEquals(expectedOutput1, actualOutput1, "Encoding failed for input: " + input1);

//         // Test case 2: Encode a number with an odd number of digits
//         String input2 = "99999";
//         byte[] expectedOutput2 = new byte[]{0x09, (byte) 0x99, (byte) 0x99};
//         byte[] actualOutput2 = f.encode(input2);
//         assertArrayEquals(expectedOutput2, actualOutput2, "Encoding failed for input: " + input2);

//         // Test case 3: Encode a single digit
//         String input3 = "7";
//         byte[] expectedOutput3 = new byte[]{0x07};
//         byte[] actualOutput3 = f.encode(input3);
//         assertArrayEquals(expectedOutput3, actualOutput3, "Encoding failed for input: " + input3);

//         // Test case 4: Encode an empty string
//         String input4 = "";
//         byte[] expectedOutput4 = new byte[]{};
//         byte[] actualOutput4 = f.encode(input4);
//         assertArrayEquals(expectedOutput4, actualOutput4, "Encoding failed for input: " + input4);
//     }

//     @Test
//     public void testDecode() {
//         Func f = new Func();

//         // Test case 1: Decode a regular BCD encoded byte array
//         byte[] input1 = new byte[]{0x12, 0x34};
//         String expectedOutput1 = "1234";
//         String actualOutput1 = f.decode(input1);
//         assertEquals(expectedOutput1, actualOutput1, "Decoding failed for input: " + byteArrayToString(input1));

//         // Test case 2: Decode a BCD encoded byte array with an initial "0"
//         byte[] input2 = new byte[]{0x09, (byte) 0x99, (byte) 0x99};
//         String expectedOutput2 = "99999";
//         String actualOutput2 = f.decode(input2);
//         assertEquals(expectedOutput2, actualOutput2, "Decoding failed for input: " + byteArrayToString(input2));

//         // Test case 3: Decode a single digit BCD encoded byte array
//         byte[] input3 = new byte[]{0x07};
//         String expectedOutput3 = "7";
//         String actualOutput3 = f.decode(input3);
//         assertEquals(expectedOutput3, actualOutput3, "Decoding failed for input: " + byteArrayToString(input3));

//         // Test case 4: Decode an empty BCD encoded byte array
//         byte[] input4 = new byte[]{};
//         String expectedOutput4 = "";
//         String actualOutput4 = f.decode(input4);
//         assertEquals(expectedOutput4, actualOutput4, "Decoding failed for input: " + byteArrayToString(input4));
//     }

//     private String byteArrayToString(byte[] byteArray) {
//         StringBuilder sb = new StringBuilder();
//         for (byte b : byteArray) {
//             sb.append(String.format("%02X", b));
//         }
//         return sb.toString();
//     }
// }
