/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 11/2/2023
 * hameyre_EnhancedSimpleGUI class, which allows a user
 to construct an object of said class / track and reset pushes.
 *
**/

// our imports
import javax.swing.*;
import java.awt.event.*;

// EnhancedSimpleGUI class, which extends JFrame
public class hamey_EnhancedSimpleGUI extends JFrame {

   // instance vars
   private int count;
   private JButton pushMe;
   private JLabel pushes;
   private JButton clearMe;
   
   // constructor
   public hamey_EnhancedSimpleGUI() {
      // calling our superclass constructor, setting size / default behavior,
      // set count to 0
      super("Push Counter");
      setSize(300, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      count = 0;
      
      // creating our panel and other components with appropriate text
      JPanel buttonPanel = new JPanel();
      pushMe = new JButton("Push Me");
      clearMe = new JButton("Clear Me");
      pushes = new JLabel(count + " Pushes");
      
      // creating our listeners for our buttons, and appending all components
      pushMe.addActionListener(new PushMeListener());
      buttonPanel.add(pushMe);
      clearMe.addActionListener(new ClearMeListener());
      buttonPanel.add(clearMe);
      buttonPanel.add(pushes);
      getContentPane().add(buttonPanel);
   }
   
   // first listener class PushMeListener, which overrides the abstract actionPerformed
   // method from the ActionListener interface
   private class PushMeListener implements ActionListener {
   
      /**
       * actionPerformed method, which takes in an ActionEvent object and increments
       * our count and updates label text   
       * @param event, an ActionEvent object
       * @return none (void)
       */
      public void actionPerformed(ActionEvent event) {
         count++;
         String s = count + " Pushes";
         pushes.setText(s);
      }     
   
   }
   
   // second listener class ClearMeListener, which overrides the abstract actionPerformed
   // method from the ActionListener interface
   private class ClearMeListener implements ActionListener {
   
      /**
       * actionPerformed method, which takes in an ActionEvent object and resets
       * our count to 0 and updates label text   
       * @param event, an ActionEvent object
       * @return none (void)
       */
      public void actionPerformed(ActionEvent event) {
         count = 0;
         String s = count + " Pushes";
         pushes.setText(s);
      }     
   
   }
   
   // main method
   public static void main(String[] args) {
      // creating our EnhancedSimpleGUI object and setting it visible
      hamey_EnhancedSimpleGUI simpleButtonUI = new hamey_EnhancedSimpleGUI();
      simpleButtonUI.setVisible(true);
   }

}