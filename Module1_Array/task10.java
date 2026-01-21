class Stack {
    int top;
    int[] arr;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public int append(int a) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
            return -1;
        }
        top++;
        arr[top] = a;
        return arr[top];
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int popped = arr[top];
        arr[top] = 0;
        top--;
        return popped;
    }
    
    public void currstateStack(){
        System.out.println("top is at "+ top);
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
        
        return;
        
    }
}

class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
         s.currstateStack();
        System.out.println(s.append(10));
        System.out.println("----After appending 10 -----");
        s.currstateStack();
        System.out.println(s.append(17));
        System.out.println("----After appending 17 -----");
        s.currstateStack();
        System.out.println(s.pop());
        System.out.println("----After pop -----");
        s.currstateStack();
    }
}
