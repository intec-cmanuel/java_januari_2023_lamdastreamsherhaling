package be.intecbrussel.recyclebin;

import be.intecbrussel.validators.StringValidator;

public class StringIsWordValidator implements StringValidator {
    @Override
    public boolean validateString(String sentence) {
        return !sentence.trim().contains(" "); // word is
    }
}
