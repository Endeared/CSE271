import javax.swing.*;
import java.awt.event.*;

public class GUI {
      public static void main(String[] args){
      JFrame frame = new JFrame();
      JPanel panel = new JPanel();
      
      JButton button = new JButton("Click Me");
      ActionListener trigger = new ClickListener();
      button.addActionListener(trigger);
      
      JLabel label = new JLabel("CSE 271");
      panel.add(button);
      panel.add(label);
      
      frame.add(panel);
      frame.setSize(400,400);
      frame.setTitle("My Frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
     }

}