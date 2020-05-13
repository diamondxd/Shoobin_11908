public class LinkedQueue<E> {


    private Element head;
    private int size;

    public LinkedQueue() {
        head = null;
        size = 0;
    }

    public void add(E e) {

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

    public E peek() {
        return (E) head.data;
    }

    public E poll() {

        Element q = head;
        head = head.next;

        return (E) q.data;
    }


}
