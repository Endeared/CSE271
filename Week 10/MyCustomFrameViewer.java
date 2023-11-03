import javax.swing.JFrame;

public class MyCustomFrameViewer
{
   public static void main(String[] args)
   {
      MyCustomFrame frame = new MyCustomFrame();
      frame.setTitle("My first frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}