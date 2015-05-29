import java.awt.*;

/**
 * @author Liam
 *         Special Answer Cards that Allow you to type in your own Answer
 */
public class Blank extends Answer {

    final private Color CARD_COLOR = Color.WHITE;
    final private Color TEXT_COLOR = Color.BLACK;
    final private String TYPE = "Answer";

    public Blank() {
        super("_______________");
        super.setCardColor(CARD_COLOR);
        super.setTextColor(TEXT_COLOR);
        super.setCardType(TYPE);
    }

}
