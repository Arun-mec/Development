class Stack {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }
    
    Node top = null;
    
    public void push(int data) {
        Node newNode = new Node(data);
        
        if (top==null) {
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
    }
    // Remove top element
    public void pop() {
        Node temp = top;
        if (top==null) {
            System.out.println();
        }
        
        top = top.next;
    }
    
    public void display() {
        Node temp = top;
        
        if (top==null) {
            System.out.println("Empty");
            return;
        }
        
        while (temp!=null) {
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        stack.pop();
        
        stack.display();
    }
    
}