import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arrayList<E> implements List<E> {

    private static final Object[] empty = {};
    private int size;
    private Object[] elements;


    public arrayList() {
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
    public boolean addAll(int index, Collection<? extends E> c) {
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
        size = 0;
        elements = empty;
    }

    @Override
    public E get(int index) {
        return (E) elements[index];
    }

    @Override
    public E set(int index, E element) {
        elements[index] = element;
        return element;
    }

    @Override
    public void add(int index, E element) {

        size++;
        Object[] b = new Object[size];

        for(int i = 0; i < index; i++) {
            b[i] = elements[i];
        }

        b[index] = element;

        for(int i = index + 1; i < size; i++) {
            b[i] = elements[i-1];
        }

        elements = b;

    }

    @Override
    public E remove(int index) {
        Object c = elements[index];
        size--;
        Object[] b = new Object[size];

        for(int i = 0; i < index; i++) {
            b[i] = elements[i];
        }

        for(int i = index; i < size; i++) {
            b[i] = elements[i + 1];
        }

        elements = b;

        return (E) c;

    }

    @Override
    public int indexOf(Object o) {
        for(int i = 0; i < size; i++) {
            if(elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for(int i = size - 1; i >= 0; i--) {
            if(elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        List<E> n = new arrayList<>();
        for(int i = fromIndex; i <= toIndex; i++) {
            n.add((E) elements[i]);
        }
        return n;
    }
}
