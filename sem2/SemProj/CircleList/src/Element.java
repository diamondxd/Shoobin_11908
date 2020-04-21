
public class Element {

    Participant data;
    Element next;

    public Element(Participant data, Element next) {
        this.data = data;
        this.next = next;
    }

    public Participant getData() { return data; }
    public Element getNext() { return next; }
    public boolean hasNext() { return next != null; }

}
