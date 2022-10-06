package hu.nyirszikszi.b214;

public class LinkedList {
    private Node first;

    public LinkedList() {}

    public void add(Node number){
        if( first == null)
            first = number;
        else{
            Node current = first;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(number);
        }
    }

    public void addFirst(Node number){
        Node tmp = first;
        first = number;
        number.setNext(tmp);
    }

    public boolean remove(int number){
        Node current = first;
        Node prev = null;

        while (current.getNumber() != number) {
            if(current == null) return false;

            prev = current;
            current = current.getNext();
        }

        if(prev != null)
            prev.setNext(current.getNext());
        else if(current.getNumber() == number) {
            first = current.getNext();
        }

        return true;
    }

    public int get(int number){
        if(first == null)
            return -1;

        int ind = 0;
        Node current = first;
        while (current != null) {
            if(current.getNumber() == number)
                return ind;
            ind++;
            current = current.getNext();
        }
        return -1;
    }

    public Node getNode(int index){
        if(first == null)
            return null;

        int ind = 0;
        Node current = first;
        while (current != null) {
            if(ind == index)
                return current;
            ind++;
            current = current.getNext();
        }
        return null;
    }

    public Node first(){
        return first;
    }

    public Node last(){
        Node current = first;
        while (current.getNext() != null)
            current = current.getNext();

        return current;
    }

    public boolean contains(int number){
        if(first == null)
            return false;

        Node current = first;
        while (current != null) {
            if(current.getNumber() == number)
                return true;
            current = current.getNext();
        }
        return false;
    }

    public void clear(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        Node current = first;
        int ind = 0;
        while(current != null) {
            ind++;
            current = current.getNext();
        }
        return ind;
    }

    @Override
    public String toString() {
        return first.printNode();
    }
    public void print(){
        Node current = first;
        while (current != null){
            System.out.print(current.getNumber() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }


}
