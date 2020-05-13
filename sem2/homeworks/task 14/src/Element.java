public class Element {

    Object data;
    Element next;

    public Element(Object data, Element next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() { return data; }
    public Element getNext() { return next; }
    public boolean hasNext() { return next != null; }
}
