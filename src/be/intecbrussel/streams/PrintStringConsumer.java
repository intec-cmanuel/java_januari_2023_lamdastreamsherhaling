package be.intecbrussel.streams;

import java.util.function.Consumer;

public class PrintStringConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
