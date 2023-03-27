package be.intecbrussel;

import be.intecbrussel.streams.NoSmallWordPredicate;
import be.intecbrussel.streams.PrintStringConsumer;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApp {

    public static void main(String[] args) {
        String[] words = new String[]{"potato", "tomato", "hospitalbill", "bob"};

        Stream.of(words)
                .filter(word -> word.length() >= 4)
                .forEach(System.out::println);

    }
}
