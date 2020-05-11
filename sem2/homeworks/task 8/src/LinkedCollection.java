import java.util.Collection;
import java.util.Iterator;

public class LinkedCollection<E> implements Collection<E> {


    private Element head;
    private int size;

    public LinkedCollection() {
        head = null;
        size = 0;
    }

    public void print() {

        Element cur = head;
        int count = 0;
        System.out.print("[");
        while (count != size) {
            System.out.print(cur.data + " ");
            cur = cur.next;
            count++;
        }
        System.out.println("]");

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

        Element q = head;

        while(q != null) {
            if(q.data.equals(o)) {
                return true;
            }
            q = q.next;
        }

        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Element q = head;

        Object[] o = new Object[size];

        for(int i = 0; i < size; i++) {
            o[i] = q;
            q = q.next;
        }

        return o;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        Element elem = new Element(e, head);
        head = elem;
        size ++;

        return true;
    }

    @Override
    public boolean remove(Object o) {

        if(head.data.equals(o)) {
            head = head.next;
            size--;
            return true;
        }

        Element q = head;

        while (q.next != null) {
            System.out.print("hi");
            if(q.next.data.equals(o)) {
                q.next = q.next.next;
                size--;
                return true;
            }
            q = q.next;
        }

        return false;
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

        head = null;
        size = 0;

    }
}
