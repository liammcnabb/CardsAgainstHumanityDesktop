import java.awt.*;

/**
 * @author Liam
 *         Super Class for all card types
 */
public class Card {

    private String cardString;
    private Color cardColor;
    private Color textColor;

    public String toString() {
        return getCardString();
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


}
