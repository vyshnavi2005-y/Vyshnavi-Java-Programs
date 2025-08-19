public class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class MyLinkedList {
        Node head;
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        public void delete(int key) {
            if (head == null) return;
            if (head.data == key) {
                head = head.next;
                return;
            }
            Node current = head;
            while (current.next != null && current.next.data != key) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            }
        }
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original list:");
        list.printList();
        list.delete(20);
        System.out.println("After deleting 20:");
        list.printList(); 
        list.delete(10);
        System.out.println("After deleting 10:");
        list.printList();
    }
}

