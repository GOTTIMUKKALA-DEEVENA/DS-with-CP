import java.util.Arrays;

class DynamicArray {

    private int[] arr;   // internal array
    private int size;    // current number of elements

    // Constructor
    public DynamicArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Append / Push → O(1)
    public void append(int value) {
        if (size == arr.length) {
            System.out.println("Array is full, cannot append");
            return;
        }
        arr[size] = value;
        size++;
    }

    // Insert at index → O(n)
    public void insert(int index ,int value) {
        if (size == arr.length) {
            System.out.println("Array is full, cannot insert");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        // shift right
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        size++;
    }

    // Delete at index → O(n)
    public void delete(int index) {
        if (size == 0) {
            System.out.println("Array is empty, cannot delete");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        // shift left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = 0; // optional cleanup
        size--;
    }

    // Pop last element → O(1)
    public void pop() {
        if (size == 0) {
            System.out.println("Array is empty, cannot pop");
            return;
        }

        arr[size - 1] = 0; // optional
        size--;
    }

    // Print array (only valid elements)
    public void print() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }

    // Get current size
    public int getSize() {
        return size;
    }

    // Get capacity
    public int getCapacity() {
        return arr.length;
    }
}


class Main {
    public static void main(String[] args) {

        DynamicArray da = new DynamicArray(20);
        
        
        // print 
        da.print();

        // Initial insert
        
        da.append(500);
        
        
        
        da.append(600);
        
        da.append(700);
        
        da.append(800);
        
        da.append(900);
        
        int size=da.getSize();
        
        
        
        
        da.print();
        
        System.out.println("current size "+size);
        
        
        da.pop();
        
        da.print();
        
        da.insert(2,1000);
        
        da.print();
        
        
        System.out.println("current size "+da.getSize());
        
        da.insert(3,2000);
        
        da.print();
        
        da.append(10000);
        
        da.print();
        
        da.delete(2);
        da.print();
        
        
 

    }
}
