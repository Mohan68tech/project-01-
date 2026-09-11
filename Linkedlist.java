 ```java
public class Linkedlist {

    Node head;

    // Constructor
    public Linkedlist() {
        this.head = null;
    }

    // Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at beginning
    public void insertbeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert at last
    public void insertatlast(int data) {

        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Find the last node
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        // Connect last node to new node
        current.next = newNode;
    }

    // Reverse Linked List
    public void reverse() {

        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            // Store next node
            next = current.next;

            // Reverse the link
            current.next = previous;

            // Move previous forward
            previous = current;

            // Move current forward
            current = next;
        }

        // Update head
        head = previous;
    }

    // Display Linked List
    public void displayList() {

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " -> ");

            current = current.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        Linkedlist nn = new Linkedlist();

        // Insert at beginning
        nn.insertbeginning(10);
        nn.insertbeginning(20);
        nn.insertbeginning(30);
        nn.insertbeginning(40);
        nn.insertbeginning(50);

        System.out.println("Original Linked List:");
        nn.displayList();

        // Reverse the linked list
        nn.reverse();

        System.out.println("Reversed Linked List:");
        nn.displayList();

        // Insert at last
        nn.insertatlast(60);

        System.out.println("After inserting 60 at last:");
        nn.displayList();
    }
}

   