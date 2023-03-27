package be.intecbrussel.streams;

import java.util.function.Predicate;

public class NoSmallWordPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.length() >= 4;
    }
}
