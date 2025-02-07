class SLinkedList {
    class Node {
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
        
        if (head==null) {
            head = newNode;
        }else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    
    public void display() {
        Node temp = head;
        
        if (head==null) {
            System.out.println("Empty");
            return;
        }
        
        while (temp!=null) {
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    
    public void reverseList() {
        Node curr = head, prev = null, temp = null;
        
        while (curr!=null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        head = prev;
    }

}

class Main {
    public static void main(String[] args) {
        
        SLinkedList lnkList = new SLinkedList();
        
        lnkList.add(6);
        lnkList.add(10);
        lnkList.add(5);
        lnkList.add(7);
        lnkList.add(8);
        lnkList.add(9);
        lnkList.add(12);
        
        // lnkList.swap(12,10);
        
        // lnkList.display();
        
        lnkList.reverseList();
        
        lnkList.display();
    }
    
}