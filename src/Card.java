import javax.swing.*;
import java.awt.*;

/**
 * @author Liam
 *         Super Class for all card types
 */
public class Card {

    private String cardString;
    private Color cardColor;
    private Color textColor;
    private String cardType;


    /**
     * String Representation of the card
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Card{" +
                "cardString='" + cardString + '\'' +
                ", cardColor=" + cardColor +
                ", textColor=" + textColor +
                ", cardType='" + cardType + '\'' +
                '}';
    }


    public boolean Draw(int xPos, int yPost, JFrame frame) {
        //TODO
        return true;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**                                           GETTERS AND SETTER                                                     **/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * gets the card string
     *
     * @return String
     */
    public String getCardString() {
        return cardString;
    }

    /**
     * sets the card string
     *
     * @param cardString String to be found on card
     */
    public void setCardString(String cardString) {
        this.cardString = cardString;
    }

    /**
     * gets the card's color
     *
     * @return Color
     */
    public Color getCardColor() {
        return cardColor;
    }

    /**
     * sets the card color
     *
     * @param cardColor Color of the card
     */
    public void setCardColor(Color cardColor) {
        this.cardColor = cardColor;
    }

    /**
     * gets the color of text on the card
     *
     * @return Color
     */
    public Color getTextColor() {
        return textColor;
    }

    /**
     * sets the color of text on the card
     *
     * @param textColor color of text on card
     */
    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    /**
     * gets the type of the card
     *
     * @return String type of the card
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * sets the type of the card
     *
     * @param cardType type of card
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
