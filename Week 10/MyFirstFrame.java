import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class MyFirstFrame
{
   public static void main(String[] args)
   {
      JPanel panel = new JPanel();
      panel.setBackground(new Color(180, 210, 255));
      JButton button = new JButton("Click");
      button.setSize(200, 100);
      
      
      
      JLabel label =  new JLabel("I am Groot");
      
      panel.add(button);
      panel.add(label);
      JFrame frame = new JFrame();
      frame.add(panel);
      
      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;
      frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
      frame.setTitle("My first frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
