public class UncommonErrorSolution {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
            // Log the exception details (e.g., using a logging framework like Log4j or SLF4j)
            //  Consider throwing a custom exception for better error reporting and handling
            throw new CustomException("Division by zero occurred.", e); //Example custom Exception
        } catch (Exception e) {
            System.err.println("Unexpected exception: " + e.getMessage());
            // Log the exception details
            // Re-throw or handle differently depending on the situation
        } finally {
            System.out.println("This always executes.");
            // Perform cleanup operations (close resources etc.) in finally block
        }
    }

    static class CustomException extends RuntimeException {
        public CustomException(String message, Throwable cause) {
            super(message, cause);
        }
    }
} 