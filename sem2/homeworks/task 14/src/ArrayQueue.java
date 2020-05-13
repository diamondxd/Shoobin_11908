

public class ArrayQueue<E>  {

    private Object[] arr;
    private int size;

    public ArrayQueue() {
        arr = new Object[0];
        size = 0;
    }

    public void print() {
        System.out.print("[ ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void add(E e) {
        size++;
        Object[] arr1 = new Object[size];
        for(int i = 0; i <arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[size - 1] = e;
        arr = arr1;
    }



    public E poll() {
        size--;
        Object[] arr1 = new Object[size];
        for(int i = 0; i <size; i++) {
            arr1[i] = arr[i + 1];
        }
        Object h = arr[0];
        arr = arr1;
        return  (E) h;
    }



    public E peek() {
        return (E) arr[0];
    }
}
