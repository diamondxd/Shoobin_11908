import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class linkedList<E> implements List<E> {

    private Element head;
    private int size;

    public linkedList() {
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
        System.out.println("]\n");

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

        head = null;
        size = 0;
    }

    @Override
    public E get(int index) {

        if(index > size) { return null; }
        Element q = head;

        for(int i = 0; i < index; i++) {
            q = q.next;
        }

        return (E) q;
    }

    @Override
    public E set(int index, E element) {

        Element q = head;

        for(int i = 0; i < index; i++) {
            q = q.next;
        }

        q.data = element;

        return element;
    }

    @Override
    public void add(int index, E element) {

        if(index > size) { return; }
        size++;

        Element q = head;

        for(int i = 1; i < index; i++) {
            q = q.next;
        }

        Element elem = new Element(element, q.next);
        q.next = elem;

    }

    @Override
    public E remove(int index) {
        if(index > size) { return null; }
        size--;

        Element q = head;

        for(int i = 1; i < index; i++) {
            q = q.next;
        }

        q.next = q.next.next;

        return (E) q.next.next.data;
    }

    @Override
    public int indexOf(Object o) {

        if(!contains(o)) { return -1; }

        Element q = head;

        for(int i = 0; i < size; i++) {
            if(q.data.equals(o)) {
                return i;
            }
            q = q.next;
        }

        return -1;

    }

    @Override
    public int lastIndexOf(Object o) {
        if(!contains(o)) { return -1; }

        Element q = head;
        int c = -1;

        for(int i = 0; i < size; i++) {
            if(q.data.equals(o)) {
                c = i;
            }
            q = q.next;
        }

        return c;
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

        if(toIndex > size) { return null; }

        Element q = head;
        linkedList<E> list = new linkedList<>();

        for(int i = 0; i < fromIndex; i++) {
            q = q.next;
        }

        for(int i = fromIndex; i <= toIndex; i++) {
            list.add((E) q.data);
            q = q.next;
        }
        return list;
    }
}
