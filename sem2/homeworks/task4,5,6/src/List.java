public class List {
    private Element head;
    private int size = 0;

    public List() {
        head = null;
    }

    public void insert(int data) {
        Element elem = new Element(data, head);
        head = elem;
        size ++;
    }

    public void setHead(Element elem) {
        if (head != null) {
            head = elem;
        }
    }

    public void removeHead() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        Element q = head;
        int c = 0;

        while(c != size - 2) {
            q = q.next;
            c++;
        }
        q.next = null;
        size--;
    }

    public void removeP() {

        Element q = head;
        int c = 0;

        while(c != size - 3) {
            q = q.next;
            c++;
        }

        q.next = q.next.next;
        size --;
    }

    public void removeFE(int k) {

        Element q = head;
        int c = 0;


        while(c != size - 1) {

            if(head.data == k) {
                removeHead();
                return;
            }

            if(q.next.data == k) {

                q.next = q.next.next;
                size--;
                return;
            }

            q = q.next;
            c++;

        }
    }


    public void removeAE(int k) {

        Element q = head;

        while(head.data == k) {
            removeHead();
        }

        while(q.next != null) {

            if(q.next.data == k) {
                q.next = q.next.next;
                size--;
                continue;
            }
            q = q.next;
        }

    }

    public void insertDigit(int m, int k) {

        Element q = head;
        int c = 0;

        while(c != size - 1) {
            if(q.next.data == k) {
                Element elem = new Element(m, q.next);
                q.next = elem;
                size++;
                Element elem1 = new Element(m, q.next.next.next);
                q.next.next.next = elem1;
                size++;
                break;
            }
            q = q.next;
            c++;
        }

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

    public int sum() {
        Element q = head;
        int c = 0;

        for(int i = 0; i < size; i++) {

            c += q.data;
            q = q.next;

        }

        return c;
    }

    public int max() {

        Element q = head;

        int m = head.data;

        for(int i = 0; i < size - 1; i++ ) {

            if(q.next.data > m) {
                m = q.next.data;
            }
            q = q.next;
        }

        return m;

    }

    public boolean isNegative() {

        Element q = head;

        for(int i = 0; i < size; i++) {

            if(q.data < 0) {

                return true;

            }
            q = q.next;
        }

        return false;

    }

    public Element getHead() { return head; }
    public int getSize() { return size; }

}

