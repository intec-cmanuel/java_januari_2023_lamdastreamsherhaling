package be.intecbrussel.validators;

@FunctionalInterface
public interface StringValidator {
    boolean validateString(String sentence);
}
