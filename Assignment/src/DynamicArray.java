import java.util.*;
import java.util.Scanner;
public class DynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    public DynamicArray() {
        this.capacity = 10; // Default capacity
        this.array = new int[capacity];
        this.size = 0;
    }

    public void insertValueAtEnd(int value) {
        if (size == capacity) {
            resizeArray();
        }
        array[size++] = value;
    }

    public void deleteValueByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;

        if (size <= capacity / 2) {
            shrinkArray();
        }
    }

    public void insertValueAtStart(int value) {
        if (size == capacity) {
            resizeArray();
        }
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = value;
        size++;
    }

    public void insertValueAtPosition(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (size == capacity) {
            resizeArray();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    public void viewElements() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private void resizeArray() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    private void shrinkArray() {
        capacity /= 2;
        array = Arrays.copyOf(array, capacity);
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert Value at the End");
            System.out.println("2. Delete Value by Index");
            System.out.println("3. Insert Value at the Start");
            System.out.println("4. Insert Value at a Particular Index");
            System.out.println("5. View Elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at the end: ");
                    int value = scanner.nextInt();
                    dynamicArray.insertValueAtEnd(value);
                    break;
                case 2:
                    System.out.print("Enter index to delete: ");
                    int index = scanner.nextInt();
                    dynamicArray.deleteValueByIndex(index);
                    break;
                case 3:
                    System.out.print("Enter value to insert at the start: ");
                    int valueStart = scanner.nextInt();
                    dynamicArray.insertValueAtStart(valueStart);
                    break;
                case 4:
                    System.out.print("Enter value to insert: ");
                    int valueInsert = scanner.nextInt();
                    System.out.print("Enter index to insert at: ");
                    int indexInsert = scanner.nextInt();
                    dynamicArray.insertValueAtPosition(valueInsert, indexInsert);
                    break;
                case 5:
                    System.out.println("Elements in the array:");
                    dynamicArray.viewElements();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
