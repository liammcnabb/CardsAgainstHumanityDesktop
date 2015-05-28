import java.awt.*;

/**
 * @author Liam
 *         Special Answer Cards that Allow you to type in your own Answer
 */
public class Blank extends Answer {

    final private Color CARD_COLOR = Color.WHITE;
    final private Color TEXT_COLOR = Color.BLACK;

    public Blank() {
        super("");
        super.setCardColor(CARD_COLOR);
        super.setTextColor(TEXT_COLOR);
    }

}
