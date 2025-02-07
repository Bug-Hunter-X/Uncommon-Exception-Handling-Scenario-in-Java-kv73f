public class UncommonErrorExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Exception caught: " + e.getMessage());
            // Handle the exception, maybe log it or throw a custom exception
        } catch (Exception e) {
            System.err.println("Unexpected exception: " + e.getMessage());
            // Handle other unexpected exceptions
        } finally {
            System.out.println("This always executes.");
        }
    }
}