public class LinkList {
    private Link first; // ref to first link on list

    public LinkList() {
        first = null; // no links on list yet
    }

    public void insertFirst(Card card) {
        Link newLink = new Link(card);
        newLink.next = first;
        first = newLink;
    }

    public void add(Card card) {
        Link newLink = new Link(card);
        newLink.next = first;
        first = newLink;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public Card getFirst() {
        if (first == null) {
            return null;
        }
        Link current = first;
        first = first.next;
        return current.cardLink;
    }
}
