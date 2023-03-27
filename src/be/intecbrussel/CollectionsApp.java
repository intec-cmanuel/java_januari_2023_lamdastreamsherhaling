package be.intecbrussel;

import be.intecbrussel.collections.SuperCoolListOfStrings;

public class CollectionsApp {
    public static void main(String[] args) {
        SuperCoolListOfStrings list = new SuperCoolListOfStrings();
        list.add("Sandwich");
        list.add("Tomato");
        list.add("Coffee");
        list.add("Sugar");
        list.add("Noodle");

        list.print();
    }
}
