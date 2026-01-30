class doublyLL {

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int a) {
            this.data = a;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null; // Adding a tail pointer makes addLast O(1)

    // --- INSERTION ---

    public void addFirst(int a) {
        Node newNode = new Node(a);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int a) {
        Node newNode = new Node(a);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addAt(int index, int a) {
        if (index == 0) {
            addFirst(a);
            return;
        }
        Node newNode = new Node(a);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) return;
            temp = temp.next;
        }
        if (temp == tail || temp.next == null) {
            addLast(a);
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // --- DELETION ---

    public void removeFirst() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void removeLast() {
        if (tail == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) return;
            temp = temp.next;
        }
        if (temp == tail) {
            removeLast();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // --- TRAVERSAL ---

    public void currstateDLL() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Forward: [");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? "," : ""));
            temp = temp.next;
        }
        System.out.println("]");
    }
}

class Main {
    public static void main(String[] args) {
        doublyLL dll = new doublyLL();
        
        System.out.println("--- DLL Operations ---");
        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.currstateDLL(); // [10, 20, 30]

        System.out.println("Adding 5 to First and 15 at index 2:");
        dll.addFirst(5);
        dll.addAt(2, 15);
        dll.currstateDLL(); // [5, 10, 15, 20, 30]

        System.out.println("Removing First and Last:");
        dll.removeFirst();
        dll.removeLast();
        dll.currstateDLL(); // [10, 15, 20]

        System.out.println("Removing at index 1:");
        dll.removeAt(1);
        dll.currstateDLL(); // [10, 20]
    }
}
