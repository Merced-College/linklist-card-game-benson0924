/*
CPSC-39
Dec 29 2024
Ping & Taichi
We are not sure how to do this assignment, but we tried. >_<
Anyway, Happy Thanksgiving!!!! _from your student \·u·*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CardGame {

    private static LinkList cardList = new LinkList(); // Make list

    public static void main(String[] args) {
        // File name to read from
        String fileName = "cards.txt"; // Ensure the file is in the working directory or specify the full path

        // Read the file and create Card objects
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into components
                String[] details = line.split(","); // Assuming comma-separated values
                if (details.length == 4) {
                    // Parse card details
                    String suit = details[0].trim();
                    String name = details[1].trim();
                    int value = Integer.parseInt(details[2].trim());
                    String pic = details[3].trim();

                    // Create a new Card object
                    Card card = new Card(suit, name, value, pic);

                    // Add the Card object to the list
                    cardList.add(card);
                } else {
                    System.err.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Print the loaded cards
        System.out.println("Cards loaded:");
        cardList.displayList();

        // Use ArrayList to manage the player's hand
        List<Card> playerHand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (cardList.getFirst() != null) {
                playerHand.add(cardList.getFirst());
            }
        }

        // Print the player's hand
        System.out.println("\nPlayer's hand:");
        for (Card card : playerHand) {
            System.out.println(card);
        }

        // Print the remaining cards in the deck
        System.out.println("\nRemaining cards in the deck:");
        cardList.displayList();
    } // end main
} // end class
