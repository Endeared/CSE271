/**
 * @author wernerla
 *
 */
public class InvalidCardReference extends Exception{

	/**
	 * InvalidCardReference constructor / method, which simply passes
    * an error message to the superclass (Exception) constructor
    * @param args unused
    * @return nothing
	 */
	public InvalidCardReference() {
		// TODO Auto-generated constructor stub
		super("No such card in the hand");
	}
	
   /**
	 * InvalidCardReference constructor / method, which takes in an error
    * message (msg) as a String, and then passes that String to the
    * superclass (Exception) constructor
    * @param msg, a String representing the message to pass to the superclass constructor
    * @return nothing
	 */
	 public InvalidCardReference(String msg)
	 {
	     super(msg);
	 }

	}

