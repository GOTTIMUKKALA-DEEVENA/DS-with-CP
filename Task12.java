// Implementing a queue data structure from scratch using an array involves creating a class with methods for standard queue operations: enqueue, dequeue

class queue{
    int[] arr;
    int f;  // front pointer
    int r; // rear pointer
    
    queue(int a){
        arr= new int[a];
        f=arr.length;
        r=arr.length;
    }
    
    public void enque(int val){
        if(f==0){
            System.out.println("queue is Full we cann't perform of enque oparation ");
            return;
        }
        
        // this first element in queue
        if(isEmpty()){
            arr[--r]=val;
            f--;
            return;
        }
        for(int i=f;i<=r;i++){
            arr[i-1]=arr[i];// move left most element one step left till last
        }
        // now we create a space to accomodate the new enque val
        arr[r]=val;
        f--;
    }
    
    public int deque(){
        if(isEmpty()){
            System.out.println("queue is empty we cann't perform of deque oparation ");
            return -1;
        }
        int dq = arr[f];
        arr[f]=0;
        f++;
        return dq;
    }
    
     public void currstateQueue(){
        if(isEmpty()){
            System.out.println("queue is empty ");
            // return;
            
        }
        System.out.println("front pointer is at "+ f);
        System.out.println("rear pointer is at "+ r);
        System.out.print("[");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
        
        return;
        
    }
    
    public boolean isEmpty(){
        return f==arr.length;
    }
    
    public void size(){
        int size = r-f+1;
        System.out.println("queue size is "+size);
        return;
    }
}


class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        queue q= new queue(5);
        System.out.println("is this queue empty  "+q.isEmpty());
        q.currstateQueue();
        
        System.out.println("____After enque 10______ ");
        q.enque(10);
        q.currstateQueue();
        
        System.out.println("is this queue empty : "+q.isEmpty());
      
      System.out.println("____After enque 20______ ");
        q.enque(20);
        q.currstateQueue();
        
        System.out.println("is this queue empty : "+q.isEmpty());
        
        System.out.println("____After enque 30______ ");
        q.enque(30);
        q.currstateQueue();
        
        System.out.println("is this queue empty : "+q.isEmpty());
        
        System.out.println("____After enque 40______ ");
        q.enque(40);
        q.currstateQueue();
        
        System.out.println("is this queue empty : "+q.isEmpty());
        
        System.out.println("____After enque 50______ ");
        q.enque(50);
        q.currstateQueue();
        
        System.out.println("is this queue empty : "+q.isEmpty());
        
        System.out.println("____After enque 10______ ");
        
        
        q.enque(10);// edge case
        
        System.out.println("____After deque oparation ______ ");
        q.deque();
        q.currstateQueue();
        
        System.out.println("is this queue empty : "+q.isEmpty());
        
        System.out.println("____After deque oparation ______ ");
        q.deque();
        q.currstateQueue();
        
        System.out.println("is this queue empty : "+q.isEmpty());
        
        System.out.println("____After deque oparation ______ ");
        q.deque();
        q.size();
        q.currstateQueue();
        
        System.out.println("is this queue empty : "+q.isEmpty());
        
        System.out.println("____After deque oparation ______ ");
        q.deque();
        q.size();
        q.currstateQueue();
        
        System.out.println("is this queue empty : "+q.isEmpty());
      
      System.out.println("____After deque oparation ______ ");
        q.deque();
        
        q.size();
        q.currstateQueue();
        
        System.out.println("is this queue empty : "+q.isEmpty());
        
        q.deque();  // edge case

    }
}
