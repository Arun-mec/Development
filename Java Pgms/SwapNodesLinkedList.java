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
    
    // public void reverse() {
    //     Node temp = head, prev;
        
        
    // }
    
    public void swap(int fdata, int sdata) {
        Node fcurr = head, scurr = head, fprev = null, sprev = null, temp = null;
        
        if (fdata==sdata) {
            return;
        }
        
        while (fcurr!=null && fcurr.data!=fdata) {
            fprev = fcurr;
            fcurr = fcurr.next;
        }
        
        while (scurr!=null && scurr.data!=sdata) {
            sprev = scurr;
            scurr = scurr.next;
        }
        
        if (fcurr==null || scurr==null) {
            return;
        }
        
        // Head is null
        if (fprev == null) {
            sprev.next = fcurr;
            head = scurr;
        }
        else {
            // all other cases other than head is null
            fprev.next = scurr;
            sprev.next = fcurr;
        }
        temp = fcurr.next;
        fcurr.next = scurr.next;
        scurr.next = temp;
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
        
        lnkList.swap(12,10);
        
        lnkList.display();
    
    }
    
}