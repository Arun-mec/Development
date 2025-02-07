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
    
    public void removeDuplicates() {
        Node temp = head, prev = null;
        if (temp==null) {
            System.out.println("Empty");
            return;
        }  
        
        while (temp!=null) {
            if (prev!=null && temp.data==prev.data) {
                prev.next = temp.next;
                temp = temp.next;
                continue;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}


class Main {
    public static void main(String[] args) {
        
        SLinkedList lnkList = new SLinkedList();
        
        lnkList.add(6);
        lnkList.add(10);
        lnkList.add(5);
        lnkList.add(5);
        lnkList.add(5);
        lnkList.add(9);
        lnkList.add(9);
        lnkList.add(9);
        lnkList.add(9);
        
        lnkList.removeDuplicates();
        
        lnkList.display();
    }
    
}