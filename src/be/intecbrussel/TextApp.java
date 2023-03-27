package be.intecbrussel;

import be.intecbrussel.validators.StringValidator;

import java.util.Scanner;

public class TextApp {
    public static void main(String[] args) {
        StringValidator lowercaseValidator = new StringValidator() {
            @Override
            public boolean validateString(String sentence) {
                return sentence.equals(sentence.toLowerCase());
            }
        };
        System.out.println(lowercaseValidator.getClass());

        StringValidator uppercaseValidator = new StringValidator() {
            @Override
            public boolean validateString(String sentence) {
                return sentence.equals(sentence.toUpperCase());
            }
        };

        StringValidator wordValidator = new StringValidator() {
            @Override
            public boolean validateString(String sentence) {
                return !sentence.trim().contains(" ");
            }
        };

        Scanner scanner = new Scanner(System.in);
        String stringToTest = scanner.nextLine();

        System.out.println("SENTENCE: " + stringToTest);
        System.out.println("Lowercase? " + lowercaseValidator.validateString(stringToTest));
        System.out.println("Uppercase? " + uppercaseValidator.validateString(stringToTest));
        System.out.println("Word?      " + wordValidator.validateString(stringToTest));
    }
}
