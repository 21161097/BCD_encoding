

package gradleproj;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        // Create an instance of the Func class
        Func funcInstance = new Func();

        // Call the encode method on that instance, passing a String argument
        byte[] result = funcInstance.encode("99999");

        // Print the result
        System.out.println("BCD Encoded Bytes:");
        for (byte b : result) {
            System.out.println(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
        }

        String x = funcInstance.decode(result);
        System.out.println("BCD Decoded Bytes:");
        System.out.println(x);
    }
}



// package gradleproj;

// public class App {
//     public String getGreeting() {
//         return "Hello World!";
//     }

//     public static void main(String[] args) {
//         // Create an instance of the App class
//         // App appInstance = new App();

//         // Create an instance of the func class
//         Func funcInstance = new Func();

//         // Call the encode method on that instance, passing a String argument
//         byte[] result = funcInstance.encode("99999");

//         // Print the result
//         System.out.println("BCD Encoded Bytes:");
//         for (byte b : result) {
//             System.out.println(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
//         }

//         String x = funcInstance.decode(result);
//         System.out.println("BCD Decoded Bytes:");
//         System.out.println(x);
//     }
// }

