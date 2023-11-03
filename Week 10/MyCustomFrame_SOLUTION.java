import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JFrame;

public class MyCustomFrame_SOLUTION extends JFrame
{
   // instance variables - replace the example below with your own
   private JButton button;
   private JLabel label;
   private static final int FRAME_WIDTH = 800;
   private static final int FRAME_HEIGHT = 800;
    
   public MyCustomFrame_SOLUTION()
   {
      createComponents();
      setSize(FRAME_WIDTH,FRAME_HEIGHT);
   }
   private void createComponents()
   {
      JPanel panel = new JPanel();
      panel.setBackground(Color.RED);
      button = new JButton("Push Me");
      label = new JLabel("This is a label.");
      panel.add(button);
      panel.add(label);
      add(panel);
   }
}