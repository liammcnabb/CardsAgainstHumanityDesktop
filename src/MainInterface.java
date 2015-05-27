import javax.swing.*;

/**
 * Created by Liam McNabb on 27/05/2015.
 */
public class MainInterface extends JFrame {

    final private String LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFee";
    final private String CLASS_ID = "CLASS:MainInterface, ";
    final private int WIDTH = 800;
    final private int HEIGHT = 800;

    private JFrame mainFrame = new JFrame();
    private String METHOD_ID;

    public MainInterface() {
        initialise();
    }

    public String getMETHOD_ID() {
        return "METHOD: " + METHOD_ID + " - ";
    }

    public void setMETHOD_ID(String METHOD_ID) {
        this.METHOD_ID = METHOD_ID;
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

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

        return true;
    }
}
