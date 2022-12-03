public class dynArray {
    int capacity;
    int lastIndex;
    int arr[];

    dynArray(int a) {
        capacity = a;
        lastIndex = capacity - 1;
        arr = new int[capacity];
    }

    void doubleArray(int index) {
        if (index == lastIndex) {
            arr = new int[2 * capacity];
        } else {
            System.out.println("Array is not full");
        }
    }
    public static void main(String[] args) {
        dynArray d = new dynArray(5);
    }
}