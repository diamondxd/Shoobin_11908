import java.util.Collection;
import java.util.Iterator;

public class ArrayCollection<E> implements Collection<E> {

    private static final Object[] empty = {};
    private int size;
    private Object[] elements;

    public ArrayCollection() {

        super();
        this.elements = empty;
        size = 0;

    }

    public void print() {
        for(int i = 0; i < size - 1; i++) {
            System.out.print(elements[i] + ", ");
        }
        System.out.print(elements[size-1]);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {

        for(int i = 0; i < size; i++) {
            if(elements[i].equals(o)) {
                return true;
            }
        }

        return false;

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        size++;
        Object[] a = elements;
        Object[] b = new Object[size];
        for(int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[size - 1] = e;
        elements = b;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        size--;
        Object[] a = new Object[size];
        int i1 = 0;
        for(int i = 0; i <= size; i++) {
            if(!elements[i].equals(o)) {
                a[i1] = elements[i];
                i1++;
            }
            else {
            }
        }

        elements = a;

        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        elements = empty;
        size = 0;
    }
}
