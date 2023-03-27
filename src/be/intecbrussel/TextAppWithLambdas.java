package be.intecbrussel;

import be.intecbrussel.validators.StringValidator;

import java.util.Scanner;

public class TextAppWithLambdas {
    public static void main(String[] args) {
        StringValidator lowercaseValidator = sentence -> sentence.equals(sentence.toLowerCase());
        StringValidator uppercaseValidator = sentence -> sentence.equals(sentence.toUpperCase());
        StringValidator wordValidator = words -> !words.trim().contains(" ");

        System.out.println(lowercaseValidator.getClass());

        Scanner scanner = new Scanner(System.in);
        String stringToTest = scanner.nextLine();

        System.out.println("SENTENCE: " + stringToTest);
        System.out.println("Lowercase? " + lowercaseValidator.validateString(stringToTest));
        System.out.println("Uppercase? " + uppercaseValidator.validateString(stringToTest));
        System.out.println("Word?      " + wordValidator.validateString(stringToTest));
    }
}
