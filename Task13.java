// Implementing a queue data structure from scratch using an LinkedList involves creating a class with methods for standard queue operations: enqueue, dequeue and some help methods
class queueLL{
    
    private class Node{
        int data;
        Node next;
        Node(int a){
            this.data=a;
            this.next=null;
        }
    }
    
    Node f=null; // two pointer front and rear\
    Node r=null;
    
    public void enque(int a){
        if(isEmpty()){
            // this the first element of queue
            Node newNode = new Node(a);
            f=r=newNode;
            return;
        }
        Node newNode = new Node(a);
        r.next=newNode;
        r=newNode;
    }
    
    public int deque(){
        if(isEmpty()){
            System.out.println("this queue is empty there is nothing to deque here");
            return -1;
        }
        if(f == r){
            // this is only one element in this queue
            //if you your deque this then queue became empty
            int dq=f.data;
            f=f.next;
            f=null;
            r=null;
            
            
            return dq;
        }
        
        int dq=f.data;
        f=f.next;
        
        
        return dq;
        
    }
    
    public boolean isEmpty(){
        return r==null;
    }
    
    public void currstateQueue(){
        if(isEmpty()){
            System.out.println("queue is empty ");
            // return;
            
        }
        
        if(!isEmpty()){
            System.out.println("front pointer pointing element is at "+ f.data);
            System.out.println("rear pointer  pointing element is at "+ r.data);
            // return;
            
        }
        
        System.out.print("[");
        for(Node i=f;i != null ;i=i.next){
            System.out.print(i.data+",");
        }
        System.out.println("]");
        
        return;
        
    }
    
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        queueLL q= new queueLL();
        System.out.println("is this queue empty  "+q.isEmpty());
        q.currstateQueue();
        
        System.out.println("____After enque 10______ ");
        q.enque(10);
        System.out.println("is this queue empty  "+q.isEmpty());
        q.currstateQueue();
        
        System.out.println("____After enque 20______ ");
        q.enque(20);
        System.out.println("is this queue empty  "+q.isEmpty());
        q.currstateQueue();
        
        System.out.println("____After enque 30______ ");
        q.enque(30);
        System.out.println("is this queue empty  "+q.isEmpty());
        q.currstateQueue();
        
        System.out.println("____After deque oparation______ ");
        q.deque();
        System.out.println("is this queue empty  "+q.isEmpty());
        q.currstateQueue();
        
        System.out.println("____After deque oparation______ ");
        q.deque();
        System.out.println("is this queue empty  "+q.isEmpty());
        q.currstateQueue();
        
        // System.out.println(" dequed element is  "+q.deque());
        // System.out.println("is this queue empty  "+q.isEmpty());
        // q.currstateQueue();
        
        q.deque();
        System.out.println("is this queue empty  "+q.isEmpty());
        
        System.out.println("____After deque oparation______ ");
        q.deque();
        System.out.println("is this queue empty  "+q.isEmpty());
        q.currstateQueue();
    }
}
