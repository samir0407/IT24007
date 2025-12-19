package validation;

public class AgeValidator {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18 || age > 40) {
            throw new InvalidAgeException("Age must be between 20 and 40");
        }
    }
}