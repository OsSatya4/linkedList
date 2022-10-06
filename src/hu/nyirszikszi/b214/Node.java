package hu.nyirszikszi.b214;

public class Node {
    private int number;
    private Node next;

    public Node(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("Node [ number: %d, next: %b]",
                number,
                next == null ? false : true);
    }

    public String printNode(){
        return String.format("Node [number: %d, next: %s]", number, next);
    }

}
