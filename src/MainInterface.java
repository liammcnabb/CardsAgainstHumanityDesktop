import javax.swing.*;

/**
 * @author Liam
 *         The default interface which is loaded after setup. Most options can be accessed here.
 */
public class MainInterface extends JFrame {

    final private String LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
    final private String CLASS_ID = "CLASS:MainInterface, ";
    final private int WIDTH = 800;
    final private int HEIGHT = 800;

    final private String ERROR_BUILD_FRAME = "There seems to be a problem with creating the frame, closing.";

    private JFrame mainFrame = new JFrame();
    private String METHOD_ID;
    private String PREVIOUS_METHOD_ID;

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

        setMETHOD_ID(getPREVIOUS_METHOD_ID());
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
