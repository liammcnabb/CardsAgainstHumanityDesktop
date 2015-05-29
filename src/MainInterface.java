import javax.swing.*;
import java.awt.*;

/**
 * @author Liam
 *         The default interface which is loaded after setup. Most options can be accessed here.
 */
public class MainInterface extends JFrame {

    final private String LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
    final private String CLASS_ID = "CLASS:MainInterface, ";
    final private int WIDTH = 1000;
    final private int HEIGHT = 600;
    final private String ERROR_BUILD_FRAME = "There seems to be a problem with creating the frame, closing.";
    private String METHOD_ID;
    private String PREVIOUS_METHOD_ID;
    private JFrame mainFrame = new JFrame();
    private JToolBar toolbar;
    private JButton analyseDeckButton, newGameButton, loadDeckButton, settingsButton, editDeckButton, deleteDeckButton;

    /**
     * Constructor used to initialise the interface
     */
    public MainInterface() {
        setMETHOD_ID("Constructor");
        if (!initialise()) {
            JOptionPane.showMessageDialog(getMainFrame(), ERROR_BUILD_FRAME, METHOD_ID, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    /**
     * Sets up the interface to have the desired look and feel desired
     *
     * @return boolean to signify whether initialisation has occurred correctly
     */
    private boolean initialise() {
        setMETHOD_ID("initialise");
        setMainFrame(this);
        try {
            UIManager.setLookAndFeel(LOOK_AND_FEEL);
        } catch (Exception e) {
            System.out.println(CLASS_ID + getMETHOD_ID() + e);
        }
        getMainFrame().setSize(WIDTH, HEIGHT);
        getMainFrame().setResizable(false);

        createToolbar();






        setMETHOD_ID(getPREVIOUS_METHOD_ID());
        return true;
    }

    /**
     * creates the toolbar for the top
     *
     * @return boolean to signify if a problem occurs
     */
    private boolean createToolbar() {
        toolbar = new JToolBar();
        newGameButton = new JButton(new ImageIcon(
                getClass().getResource("img/NewGame.png")));
        //TODO Add Context
        toolbar.add(newGameButton);

        settingsButton = new JButton(new ImageIcon(
                getClass().getResource("img/Settings.png")));
        //TODO Add Context
        toolbar.add(settingsButton);
        toolbar.addSeparator();

        loadDeckButton = new JButton(new ImageIcon(
                getClass().getResource("img/NewDeck.png")));
        //TODO Add Context
        toolbar.add(loadDeckButton);

        editDeckButton = new JButton(new ImageIcon(
                getClass().getResource("img/EditDeck.png")));
        //TODO Add Context
        toolbar.add(editDeckButton);

        deleteDeckButton = new JButton(new ImageIcon(
                getClass().getResource("img/DeleteDeck.png")));
        //TODO Add Context
        toolbar.add(deleteDeckButton);

        analyseDeckButton = new JButton(new ImageIcon(
                getClass().getResource("img/AnalyseDeck.png")));
        //TODO Add Context
        toolbar.add(analyseDeckButton);

        add(toolbar, BorderLayout.NORTH);
        toolbar.setFloatable(false);

        return true;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**                                           GETTERS AND SETTER                                                     **/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Method to return MethodID string for exceptions
     *
     * @return current method identifier
     */
    public String getMETHOD_ID() {
        return "METHOD: " + METHOD_ID + " - ";
    }

    /**
     * Method use to set a method identifier for current Method
     *
     * @param METHOD_ID signified what method has been started
     */
    public void setMETHOD_ID(String METHOD_ID) {
        this.PREVIOUS_METHOD_ID = this.METHOD_ID;
        this.METHOD_ID = METHOD_ID;
    }

    /**
     * Returns the last method ID before the current, in the case of a return
     *
     * @return the previous method's identifier
     */
    public String getPREVIOUS_METHOD_ID() {
        return PREVIOUS_METHOD_ID;
    }

    /**
     * returns the current frame
     *
     * @return the main interface
     */
    public JFrame getMainFrame() {
        return mainFrame;
    }

    /**
     * sets the main interface
     *
     * @param mainFrame takes in current frame
     */
    public void setMainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }


}
