package be.intecbrussel.recyclebin;

import be.intecbrussel.validators.StringValidator;

public class UppercaseStringValidator implements StringValidator {
    @Override
    public boolean validateString(String sentence) {
        return sentence.equals(sentence.toUpperCase());
    }
}
