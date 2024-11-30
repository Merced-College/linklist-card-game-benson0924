public class Link {
    public Card cardLink; // Holds a card
    public Link next;     // Next link in the list

    public Link(Card card) { // Constructor
        cardLink = card;    // Assign the card to the link
        next = null;        // Initialize next as null
    }

    public void displayLink() { // Display the current link
        if (cardLink != null) {
            System.out.println(cardLink); // Print the card information
        } else {
            System.out.println("Empty link."); // Handle null case
        }
    }
}
