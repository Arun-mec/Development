class Main {
    public static void main(String[] args) {
        SLinkedList lnkList = new SLinkedList();
        lnkList.add(10);
        lnkList.add(20);
        lnkList.add(30);
        lnkList.add(40);
        lnkList.add(50);

        lnkList.display();
        System.out.println();
        
        lnkList.delete(40);
        
        lnkList.display();
        System.out.println();
        
        lnkList.delete(10);
        
        lnkList.display();
        System.out.println();
        
        lnkList.insertAfter(20,40);
        
        lnkList.display();
        System.out.println();
        
        lnkList.insertAfter(50,60);
        
        lnkList.display();
        System.out.println();
        
    }
}

class SLinkedList {
    static class Node {  // Make Node class static
        int data;
        Node next;

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
        }
        tail = newNode;
    }

    public void display() {
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
    
    public void delete(int data) {
        Node temp = head, prev = null;
        if (temp!=null && temp.data==data) {
            head = temp.next; // o(1)
            return;
        }
        
        while (temp!=null && temp.data!=data) {
            prev = temp;
            temp = temp.next;
        }
        
        if (temp==tail) {
            prev.next = null;
            tail = prev;
        }
        else {
            prev.next = temp.next;
        }
    }
    
    public void insertAfter(int nextTo, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        // System.out.println(temp.data);
        while (temp!=null && temp.data!=nextTo) {
            temp = temp.next;
        }
        
        if (temp==null) {
            return;
        }
        else if (temp==tail) {
            temp.next = newNode;
            tail = newNode; 
        }
        else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    } 
}
