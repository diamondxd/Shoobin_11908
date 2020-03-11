public class List {
    private Element head;
    int size = 0;

    public List() {
        head = null;
    }

    // Добавление элемента в начало списка
    public void insert(Participant data) {
        Element elem = new Element(data, head);
        head = elem;
        size ++;
    }

    public void setHead(Element elem) {
        if (head != null) {
            head = elem;
        }
    }

    // Удаление первого элемента из списка
    public void removeHead() {
        if (head != null) {
            head = head.next;
        }
    }

    public Element getHead() { return head; }

    public void insertAfter(Element cur, int data) {}
    public void removeAfter(Element cur) {}

    // Вывод списка
    public void print() {
        Element cur = head;
        int count = 0;
        System.out.print("[");
        while (count != size) {
            System.out.print(cur.data.getName() + " " + cur.data.getSex() + ", ");
            cur = cur.next;
            count++;
        }
        System.out.println("]");
    }

    public void removeDup() {
        Element p = head;
        while (p != null && p.next != null) {
            if (p.data == p.next.data) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
    }
}

