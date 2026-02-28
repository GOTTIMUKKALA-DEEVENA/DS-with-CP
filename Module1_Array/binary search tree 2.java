*// Online Java Compiler
class BST{
    Node root;
    
    // SEARCH METHOD
    boolean searchinBST(int key, Node root){
        Node curr = root;
        while(curr != null){
            if(key == curr.d){
                return true;
            } 
            else if(key > curr.d){
                curr = curr.r;
            } 
            else{
                curr = curr.l;
            }
        }
        return false;
    }
    
    // INSERT METHOD
    Node insert(Node root, int key){
        
        if(root == null){
            return new Node(key);
        }
        
        if(key < root.d){
            root.l = insert(root.l, key);
        }
        else if(key > root.d){
            root.r = insert(root.r, key);
        }
        
        return root;
    }
}

class Node{
    int d;
    Node l, r;
    
    Node(int d){
        this.d = d;
        this.l = this.r = null;
    }
}

class Main {
    public static void main(String[] args) {
        
        BST t = new BST();
        
        Node a = new Node(40);
        Node b = new Node(20);
        Node c = new Node(60);
        Node d = new Node(15);
        Node e = new Node(30);
        Node f = new Node(50);
        Node g = new Node(70);
        Node h = new Node(10);
        
        // linking
        a.l = b;
        a.r = c;
        b.l = d;
        b.r = e;
        c.l = f;
        c.r = g;
        d.l = h;
        
        // INSERT NEW ELEMENT
        a = t.insert(a, 25);   // inserting 25
        
        // SEARCH
        System.out.println(t.searchinBST(25, a));  // true
    }
}*
