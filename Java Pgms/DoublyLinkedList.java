class Main {
    public static void main(String[] args) {
        DLinkedList lnkList = new DLinkedList();
        lnkList.add(10);
        lnkList.add(20);
        lnkList.add(30);
        lnkList.add(40);
        lnkList.add(50);
        
        // lnkList.delete(10);

        // lnkList.displayFwd();
        // System.out.println();
        
        // lnkList.displayBwd();
        // System.out.println();
        
        // lnkList.delete(50);
        
        lnkList.insertNext(20,25);
        
        lnkList.displayFwd();
        System.out.println();
        
        lnkList.displayBwd();
        System.out.println();
        
        lnkList.insertPrev(40,35);
        
        lnkList.displayFwd();
        System.out.println();
        
        lnkList.displayBwd();
        System.out.println();
        
    }
}

class DLinkedList {
    static class Node {  // Make Node class static
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    public void displayFwd() {
        Node temp;

        if (head == null) {
            System.out.println("Empty");
        } else {
            temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    
    public void displayBwd() {
        Node temp;
        temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    
    public void delete(int data) {
        Node temp = head, prev=null;
        
        if (temp!=null && temp.data==data) {
            temp.next.prev = null;
            head = temp.next;
            // o(1)
            return;
        }
        
        while (temp!=null && temp.data!=data) {
            prev = temp;
            temp = temp.next;
        }
        
        if (temp==null) {
            return;
        }
        else if (temp==tail) {
            prev.next = null;
            tail = prev;
        }
        else {
            prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        
    }
    
    public void insertNext(int nextTo, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        
        while (temp!=null && temp.data!=nextTo) {
            temp = temp.next;
        }
        
        if (temp==null) {
            return;
        }
        else if (temp==tail) {
            newNode.prev = temp;
            temp.next = newNode;
            tail = newNode;
        }
        else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }
    
    public void insertPrev(int prevTo, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        
        while (temp!=null && temp.data!= prevTo) {
            temp = temp.next;
        }
        
        if (temp==null) {
            return;
        }
        else if (temp==head) {
            newNode.next = temp;
            temp.prev = newNode;
            head = newNode;
        }
        else {
            newNode.next = temp;
            newNode.prev = temp.prev;
            temp.prev.next = newNode;
            temp.prev = newNode;
        }
    }
}
