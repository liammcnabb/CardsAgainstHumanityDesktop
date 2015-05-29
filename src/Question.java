import java.awt.*;

/**
 * @author Liam
 *         Cards which will hold questions to answer
 */
public class Question extends Card {

    final private Color CARD_COLOR = Color.BLACK;
    final private Color TEXT_COLOR = Color.WHITE;
    final private String TYPE = "Question";

    public Question(String question) {
        super.setCardString(question);
        super.setCardColor(CARD_COLOR);
        super.setTextColor(TEXT_COLOR);
        super.setCardType(TYPE);
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**                                           GETTERS AND SETTER                                                     **/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}