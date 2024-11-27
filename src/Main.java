
public class Main {
    public static void main(String[] args) {
        // Create an instance of the App class
        App appInstance = new App();

        // Call the encode method on that instance, passing a String argument
        byte[] result = appInstance.encode("12399");

        // Print the result
        System.out.println("BCD Encoded Bytes:");
        for (byte b : result) {
            System.out.println(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
        }
    }
}
