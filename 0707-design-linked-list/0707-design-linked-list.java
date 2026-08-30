class MyLinkedList {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        Node prev = head;

        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        return prev.value;
    }

    public void addAtHead(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } 
        else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    public void addAtTail(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } 
        else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);

        Node prev = head;

        // Reach node just before the required index
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        // Delete head
        if (index == 0) {
            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }

            return;
        }

        Node prev = head;

        // Reach node just before the node to delete
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        // Remove node
        prev.next = prev.next.next;

        // If deleting the tail
        if (index == size - 1) {
            tail = prev;
        }

        size--;
    }
}