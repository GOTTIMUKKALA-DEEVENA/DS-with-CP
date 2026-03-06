// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class AVL {

    class Node {
        int d;
        int h;
        Node l, r;

        Node(int d) {
            this.d = d;
            this.h = 1;
        }
    }

    Node root;

    int height(Node n) {
        return (n == null) ? 0 : n.h;
    }

    int balanceFactor(Node n) {
        return (n == null) ? 0 : height(n.l) - height(n.r);
    }

    Node rightRotate(Node y) {
        System.out.println("Performing RIGHT Rotation on node " + y.d);

        Node x = y.l;
        Node T2 = x.r;

        x.r = y;
        y.l = T2;

        y.h = Math.max(height(y.l), height(y.r)) + 1;
        x.h = Math.max(height(x.l), height(x.r)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        System.out.println("Performing LEFT Rotation on node " + x.d);

        Node y = x.r;
        Node T2 = y.l;

        y.l = x;
        x.r = T2;

        x.h = Math.max(height(x.l), height(x.r)) + 1;
        y.h = Math.max(height(y.l), height(y.r)) + 1;

        return y;
    }

    Node insert(Node node, int key) {

        if (node == null) {
            System.out.println("Inserted: " + key);
            return new Node(key);
        }

        if (key < node.d)
            node.l = insert(node.l, key);
        else
            node.r = insert(node.r, key);

        node.h = 1 + Math.max(height(node.l), height(node.r));

        int bf = balanceFactor(node);

        System.out.println("Checking node " + node.d + " | BF = " + bf);

        // LL
        if (bf > 1 && key < node.l.d) {
            System.out.println("Case: LL Imbalance at node " + node.d);
            return rightRotate(node);
        }

        // RR
        if (bf < -1 && key > node.r.d) {
            System.out.println("Case: RR Imbalance at node " + node.d);
            return leftRotate(node);
        }

        // LR
        if (bf > 1 && key > node.l.d) {
            System.out.println("Case: LR Imbalance at node " + node.d);
            node.l = leftRotate(node.l);
            return rightRotate(node);
        }

        // RL
        if (bf < -1 && key < node.r.d) {
            System.out.println("Case: RL Imbalance at node " + node.d);
            node.r = rightRotate(node.r);
            return leftRotate(node);
        }

        return node;
    }

    void inorder(Node n) {
        if (n == null) return;
        inorder(n.l);
        System.out.print(n.d + " ");
        inorder(n.r);
    }
}



class Main {
    
    public static void main(String[] args) {

        System.out.println("AVL Tree Insertion Demo");

        int a[] = {50, 70, 80, 105, 120, 90};

        AVL t = new AVL();

        for (int i = 0; i < a.length; i++) {
            System.out.println("\n--- Inserting " + a[i] + " ---");
            t.root = t.insert(t.root, a[i]);
        }

        System.out.print("\nInorder (Sorted): ");
        t.inorder(t.root);

        System.out.println("\n=== Code Execution Successful ===");
    }
}
