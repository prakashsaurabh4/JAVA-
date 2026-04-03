import java.lang.reflect.Array;

public class GenericDemo175<T> {
    T[] data;

    public GenericDemo175(Class<T> type, int size) {
        data = (T[]) Array.newInstance(type, size);
    }

    // Add element at index
    public void add(int index, T value) {
        data[index] = value;
    }

    // Get element at index
    public T get(int index) {
        return data[index];
    }

    // Display all elements
    public void display() {
        for(T element : data) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Create String array
        GenericDemo175<String> gd = new GenericDemo175<>(String.class, 3);
        gd.add(0, "Hello");
        gd.add(1, "World");
        gd.add(2, "Java");
        
        System.out.println("String Array:");
        gd.display();

        // Create Integer array
        GenericDemo175<Integer> gd2 = new GenericDemo175<>(Integer.class, 3);
        gd2.add(0, 10);
        gd2.add(1, 20);
        gd2.add(2, 30);
        
        System.out.println("\nInteger Array:");
        gd2.display();
    }
}