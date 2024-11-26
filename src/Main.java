
public class Main {
    public static void main(String[] args) {
        // Create an instance of the App class
        App appInstance = new App();

        // Call the encode method on that instance, passing a String argument
        byte[] result = appInstance.encode("1234567");

        // Print the result
        // System.out.println(Arrays.toString(result));
    }
}
