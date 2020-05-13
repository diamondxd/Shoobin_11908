
public class LinkedStack<E> {

    private Element head;
    private int size;

    public LinkedStack() {
        head = null;
        size = 0;
    }

    public void push(E e) {

        Element elem = new Element(e, head);
        head = elem;
        size++;


        if(size > 1) {
            Element q = head;
            while(q.next != null) {
                q = q.next;

            }

            Element q1 = head;
            head = head.next;
            q.next = q1;
            q1.next = null;

        }

    }

    public void print() {
        Element q = head;
        System.out.print("[ ");
        while(q != null) {
            System.out.print(q.data + " ");
            q = q.next;
        }
        System.out.print("]");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E pop() {

        Element q = head;
        while(q.next.next != null) {
            q = q.next;
        }

        Element h = q.next;
        q.next = null;

        return (E) h.data;
    }

    public E peek() {
        Element q = head;
        while(q.next != null) {
            q = q.next;
        }

        return (E) q.data;
    }

}
