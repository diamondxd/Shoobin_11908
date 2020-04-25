
public class Element {

    int data;
    Element next;

    public Element(int data, Element next) {
        this.data = data;
        this.next = next;
    }

    public int getData() { return data; }
    public Element getNext() { return next; }
    public boolean hasNext() { return next != null; }

}