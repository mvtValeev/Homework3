import java.util.NoSuchElementException;

public class MyArrayList implements SimpleList {
    public int[] array;
    public int current_size;
    public int size;

    public MyArrayList() {
        array = new int[size];
        current_size = size;

    }

    public MyArrayList(int capacity) {
        array = new int[capacity];
        current_size = capacity;
    }

    @Override
    public void add(int item) {
        int[] array2 = new int[current_size + 1];
        if (current_size >= 0) System.arraycopy(array, 0, array2, 0, current_size);
        array2[current_size] = item;
        array = array2;
        current_size += 1;
    }
    

    // ваш метод
    @Override
    public int remove(int idx) throws NoSuchElementException {
        if (current_size <= idx || idx < 0) {
            throw new NoSuchElementException();
        }
        int[] array2 = new int[current_size - 1];
        for (int i = 0; i < current_size - 1; i++) {
            if (i <= idx) {
                array2[i] = array[i];
            }
            if (i >= idx) {
                array2[i] = array[i + 1];
            }
        }
        int a = array[idx];
        array = array2;
        current_size -= 1;
        return a;
    }

    // ваш метод
    @Override
    public int size() {
        return current_size;
    }

    // ваш метод
    @Override
    public int get(int idx) throws NoSuchElementException {
        if (current_size <= idx || idx < 0) {
            throw new NoSuchElementException();
        }
        return this.array[idx];
    }
}
// ваш метод

