class Queue {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }
    
    Node front = null;
    Node rear = null;
    
    public void enqueue(int data) {
        Node newNode = new Node(data);
        
        if (rear==null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    
    public void dequeue(){
        if (rear==null) {
            return;
        }
        front = front.next;
        
        if (front==null) {
            rear = null;
        }
    }
    
    
    public void display() {
        Node temp = front;
        
        if (front==null) {
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
        
        Queue queue = new Queue();
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        
        queue.display();
        
        // Remove from first element
        queue.dequeue();
        
        System.out.println();
        
        queue.display();
    }
    
}