public class ArrayStack<E> {

    private int size;
    private Object[] arr;


    public ArrayStack() {
        size = 0;
        arr = new Object[0];
    }

    public void print() {
        System.out.print("[");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public void push(E e) {
        size++;
        Object[] arr1 = new Object[size];
        for(int i = 0; i <arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[size - 1] = e;
        arr = arr1;
    }

    public E pop() {
        size--;
        Object r = arr[size];
        Object[] arr1 = new Object[size];
        for(int i = 0; i < size; i++) {
            arr1[i] = arr[i];
        }
        arr = arr1;

        return (E) r;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        return (E) arr[size - 1];
    }
}
