public class HelloApp {

    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            // Join all names with comma
            String result = String.join(", ", args);

            System.out.println("Hello " + result);
        }
    }
}
