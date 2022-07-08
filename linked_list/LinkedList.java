public class LinkedList {
    Node head;
    int size;

    LinkedList() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data, Node next) {
            this.data = data;
            this.next = next;
            size++;
        }

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;

        if (head.next == null) {
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondLastNode = head;
        while (lastNode.next != null) {
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return this.size;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("World");
        list.addFirst("Hello");
        list.addLast("!");
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }

}
