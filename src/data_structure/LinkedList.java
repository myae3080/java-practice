package data_structure;

public class LinkedList {
    private Node head;
    private int size = 0;

    private class Node {
        private Object data;
        private Node next;

        public Node (Object data) {
            this.data = data;
            this.next = null;
        }
    }
}
