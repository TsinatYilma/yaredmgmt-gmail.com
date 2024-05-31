


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;


    // Insert a node at a given position

    public void insertAtPos(int position, int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If the list is empty or the position is 0, insert at the beginning
        if (head == null || position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the desired position
        Node current = head;
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        // Insert the new node at the desired position
        newNode.next = current.next;
        current.next = newNode;
    }
    // Search for a node with a specific value
    public boolean searchNode(int value) {
        Node current = head;

        while (current != null) {
            if (current.data == value) {
                return true; // Node found
            }
            current = current.next;
        }
        return false; // Node not found
    }

    // Delete the node that occurs after a given node
    public void deleteAfterNode(Node givenNode) {
        if (givenNode == null || givenNode.next == null) {
            return; // Given node is null
        }

        givenNode.next = givenNode.next.next;
    }

    // Delete a node at a given position
    public void deleteAtPosition(int position) {
        // If the list is empty  delete the head node
        if (head == null || position == 0) {
            head = (head != null) ? head.next : null;
            return;
        }

        // Traverse to the node just before the desired position
        Node current = head;
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        // If the current node's next is null, the position is out of range
        if (current.next == null) {
            return;
        }

        // Delete the node at the needed position
        current.next = current.next.next;
    }
}
public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Search for a node

        // Insert a node at a given position
        list.insertAtPos(0, 10);
        list.insertAtPos(1, 20);
        list.insertAtPos(2, 30);

        // Delete a node at a given position
        list.deleteAtPosition(1);
        System.out.println(list.searchNode(30));
    }
}