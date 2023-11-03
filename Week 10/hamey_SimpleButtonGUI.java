/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 11/2/2023
 * hameyre_SimpleButtonGUI class, which allows a user
 to construct an object of said class / track pushes.
 *
**/

// our imports
import javax.swing.*;
import java.awt.event.*;

// SimpleButtonGUI class, which extends JFrame
public class hamey_SimpleButtonGUI extends JFrame {
   
   // instance vars
   private int count;
   private JButton pushMe;
   
   // constructor
   public hamey_SimpleButtonGUI() {
      // calling superclass constructor and passing in text,
      // then set frame size and other default behavior, set count to 0
      super("Push Me");
      setSize(300, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      count = 0;
      
      // creating panel and button
      JPanel buttonPanel = new JPanel();
      pushMe = new JButton("Push Me!");
      
      // adding actionlistener to button, and adding button to panel,
      // then adding pane
      pushMe.addActionListener(new PushMeListener());
      buttonPanel.add(pushMe);
      getContentPane().add(buttonPanel);
   }
   
   // ActionListener called PushMeListener, which increments the count
   // and updates the GUI when button is pressed
   private class PushMeListener implements ActionListener {
   
      /**
       * actionPerformed method, which takes in an ActionEvent object and increments
       * our count and updates label text   
       * @param event, an ActionEvent object
       * @return none (void)
       */
      public void actionPerformed(ActionEvent event) {
         count++;
         String s = "Pushes: " + count;
         pushMe.setText(s);
      }     
   
   }
   
   // main method
   public static void main(String[] args) {
      // creating SimpleButtonGUI and setting it visible
      hamey_SimpleButtonGUI simpleButtonUI = new hamey_SimpleButtonGUI();
      simpleButtonUI.setVisible(true);
   }

}