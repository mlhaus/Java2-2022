package en.codegym.testing;


public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringsLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        int count = 0;
        Node currentElement = first.next;
        while(currentElement != null) {
            if(index == count) {
                return currentElement.value;
            }
            currentElement = currentElement.next;
            count++;
        }
        return null;
    }

    // Inserts the specified String at the specified position in this list.
    public void add(int index, String value) {

    }

    // Returns true if this list contains the specified element.
    public boolean contains(String value) {
        return true;
    }

    //Returns the index of the first occurrence of the specified element in this list,
    // or -1 if this list does not contain the element.
    public int indexOf(String value) {
        return -1;
    }

    // Removes the element at the specified position in this list.
    public String remove(int index) {
        return "";
    }

    //Removes the first occurrence of the specified element from this list, if it is present.
    public boolean remove(String value) {
        return false;
    }

    public void set(String oldValue, String newValue) {

    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
