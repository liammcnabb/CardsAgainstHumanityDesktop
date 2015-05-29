import java.awt.*;

/**
 * @author Liam
 *         Answer cards to be given to the user
 */
public class Answer extends Card {

    final private Color CARD_COLOR = Color.WHITE;
    final private Color TEXT_COLOR = Color.BLACK;
    final private String TYPE = "Answer";

    public Answer(String answer) {
        super.setCardString(answer);
        super.setCardColor(CARD_COLOR);
        super.setTextColor(TEXT_COLOR);
        super.setCardType(TYPE);
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**                                           GETTERS AND SETTER                                                     **/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
