import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Class for card objects
 * Represents individual playing cards.
 * Authors: William Bohonak, David Kostrinsky
 */
public class Card {

    // ============================
    // 🔹 Variables
    // ============================
    private int value;
    private String suit;
    private String color; // Allows for custom colors in settings
    private String name;  // Ace, King, Queen, numbers, etc.


    // ============================
    // 🔹 Constructors
    // ============================
    // Only one needed, defines all card properties
    
    /**
     * Creates a card object
     * @param value How much the card is worth
     * @param suit The suit of the card
     * @param color The color of the card
     * @param name The name of the card
     * @author William Bohonak
     * @author David Kostransky
     */
    
    public Card(int value, String suit, String color, String name) {
        this.value = value;
        this.suit = suit;
        this.color = color;
        this.name = name;
    }


    // ============================
    // 🔹 Get Methods
    // ============================
    
    /**
     * Returns the value of a Card object
     * @return int
     * @author William Bohonak
     * @author David Kostransky
     */
    
    public int getValue() {
        return value;
    }

    /**
     * Returns the suit of a Card object
     * @return String
     * @author William Bohonak
     * @author David Kostransky
     */

    public String getSuit() {
        return suit;
    }

    /**
     * Returns the color of a Card object
     * @return String
     * @author William Bohonak
     * @author David Kostransky
     */

    public String getColor() {
        return color;
    }

    /**
     * Returns the name of a Card object
     * @return String
     * @author William Bohonak
     * @author David Kostransky
     */

    public String getName() {
        return name;
    }


    // ============================
    // 🔹 Other Methods (future)
    // ============================
    // Add more if needed later
}