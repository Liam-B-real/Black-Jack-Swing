import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Class for player objects
 * Purpose of player object is to store data about each player.
 * Authors: William Bohonak, David Kostrinsky
 */
public class Player {

    // ============================
    // 🔹 Variables
    // ============================
    private String name;
    private int money;

    // Creates an ArrayList to store cards the player has
    private List<Card> hand;


    // ============================
    // 🔹 Constructors
    // ============================
    
    /**
     * Creates a Deck object
     * @param name Name of the player
     * @param money Amount of money this player has
     * @param hand The cards this player has stored in a List<Card>
     * @author William Bohonak
     * @author David Kostransky
     */
    public Player(String name, int money, List<Card> hand) {
        this.name = name;
        this.money = money;
        this.hand = hand;
    }


    // ============================
    // 🔹 Get Methods
    // ============================
    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public List<Card> getHand() {
        return hand;
    }


    // ============================
    // 🔹 Hand Value Calculation
    // ============================

    /**
     * Returns total of all cards in hand added up
     * @return int
     * @author William Bohonak
     * @author David Kostransky
     */
    public int getHandValue() {
        int total = 0;
        int aceCount = 0;

        // Sum values of the cards
        for (Card card : hand) {
            total += card.getValue();
            if (card.getName().equals("ace")) {
                aceCount++;
            }
        }

        // Adjust for Aces if necessary
        while (total > 21 && aceCount > 0) {
            total -= 10;  // Ace is worth 1 instead of 11
            aceCount--;
        }

        return total;
    }
    
    /**
     * Updates a player's hand
     * @author William Bohonak
     * @author David Kostransky
     */
    public void updateHand(List<Card> newHand) {
        //tbh this method is redundent
        //Can just use getHand() = newHand
        //wait no that doesnt work nvm
        hand = newHand;
    }
}