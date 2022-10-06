package hu.nyirszikszi.b214;

import com.sun.javafx.binding.StringFormatter;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        /*System.out.println(list.isEmpty());
        list.add(new Node(12));
        list.add(new Node(4));
        list.add(new Node(8));
        list.add(new Node(55));*/
        for (int i = 0; i < 100000; i++) {
            if (i%2==0)
                list.addFirst(new Node(i));
            else
                list.add(new Node(i));
        }

        /*System.out.println(list.isEmpty());
        list.print();
        list.add(new Node(5));
        list.addFirst(new Node(25));
        list.add(new Node(55));
        list.remove(55);
        list.print();
        System.out.println();
        System.out.println(list.get(25));
        System.out.println(list.getNode(1));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.first());
        System.out.println(list.last());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());*/
        

    }
}
