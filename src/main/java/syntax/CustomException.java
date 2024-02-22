package syntax;

public class CustomException {

    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

    public void validateAge(int age) throws InvalidInputException {
        if (age < 18) {
            throw new InvalidInputException("Age must be 18 or above.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        CustomException validator = new CustomException();
        try {
            validator.validateAge(16);
        } catch (InvalidInputException e) {
            System.err.println("Validation error: " + e.getMessage());
        }
    }
}
