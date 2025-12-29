// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class DynamicArray {
    private int[] arr;
    private int size;

    // Constructor
    public DynamicArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Append
    public void append(int value) {
        if (size == arr.length) {
            System.out.println("Array is full, cannot append");
            return;
        }
        arr[size] = value;
        size++;
    }

    // Delete by index
    public void delete(int idx) {
        if (size == 0) {
            System.out.println("Array is empty, cannot delete");
            return;
        }

        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = idx; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Pop (remove last element)
    public void pop() {
        if (size == 0) {
            System.out.println("Array is empty, cannot pop");
            return;
        }
        size--;
    }

    // Insert at index
    public void insert(int idx, int value) {
        if (size == arr.length) {
            System.out.println("Array is full, cannot insert");
            return;
        }

        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = size; i > idx; i--) {
            arr[i] = arr[i - 1];
        }

        arr[idx] = value;
        size++;
    }

    // Print array
    public void print() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}

class Main {
    public static void main(String[] args) {

        DynamicArray Da = new DynamicArray(5); // capacity = 5

        Da.append(100);
        Da.append(200);
        Da.append(300);
        Da.print();

        Da.insert(1, 500);
        Da.print();

        Da.delete(2);
        Da.print();

        Da.pop();
        Da.print();
    }
}
