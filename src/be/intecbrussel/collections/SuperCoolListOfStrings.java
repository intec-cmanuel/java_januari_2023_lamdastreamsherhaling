package be.intecbrussel.collections;

public class SuperCoolListOfStrings {
    private ListObject firstObject;

    public void add(String s) {
        if (firstObject == null) {
            firstObject = new ListObject(s);
        } else {
            firstObject.add(s);
        }
    }

    public void print() {
        System.out.println("MY LIST: ");
        if (firstObject == null) {
            return;
        }

        firstObject.print();
    }

    private class ListObject {
        public ListObject nextObject;
        public String value;
        public ListObject(String value) {
            this.nextObject = null;
            this.value = value;
        }

        public void add(String s) {
            if (nextObject == null) {
                nextObject = new ListObject(s);
            } else {
                nextObject.add(s);
            }
        }

        public void print() {
            System.out.println("-   " + value);
            if (nextObject == null) {
                return;
            }

            nextObject.print();
        }
    }
}
