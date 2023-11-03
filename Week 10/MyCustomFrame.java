import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Window;
import java.awt.Dimension;

public class MyCustomFrame extends javax.swing.JFrame {

   // instance vars for components
   private String buttonText = "Placeholder Text";
   private int buttonHeight = 100;
   private int buttonWidth = 200;
   private String labelText = "More Placeholder Text";
   private JPanel panel;
   private JButton button;
   private JLabel label;
   
   // constants for frame dimensions
   private static final int FRAME_HEIGHT = 800;
   private static final int FRAME_WIDTH = 800;
   
   public MyCustomFrame() {
      createComponents();
      this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
   
   private void createComponents() {
      panel = new JPanel();
      button = new JButton("Placeholder Text");
      label = new JLabel("More Placeholder Text");
      
      panel.add(button);
      panel.add(label);
      
      // button.setSize(this.buttonWidth, this.buttonHeight); <== doesn't throw an error, but doesn't change size
      button.setPreferredSize(new Dimension(this.buttonWidth, this.buttonHeight));
      
      this.add(panel);
   }

}