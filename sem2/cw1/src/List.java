/**
Тесты не проходят.
7/15
*/

public class List {

    private Node head;
    private int size = 0;

    public List() {
        head = null;
    }

    public void print() {


        Node cur = head;
        int count = 0;
        System.out.print("[");
        while (count != size) {
            System.out.print(cur.data + " ");
            cur = cur.next;
            count++;
        }
        System.out.println("]");
    }

    public void insert(int data) {
        Node elem = new Node(data, head);
        head = elem;
        size++;
    }

    public List removeAlternating() {
        Node q = head;
        int c = 0;
        List list2 = new List();


       while (q.next != null) {
            if(c == 0) {
                list2.insert(q.data);
                c = 1;
                q = q.next;
                size--;
            }
            else {
                q = q.next;
                if(q.next.next.next != null) {
                    q.next = q.next.next.next;
                    c = 0;
                }
            }

        }




        return list2;
    }

}




class Node {

        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public boolean hasNext() {
            return next != null;
        }

}
