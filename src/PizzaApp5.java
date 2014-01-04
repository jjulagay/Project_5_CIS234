/** class PizzaApp5 -- new PizzaApp class, provides option to either place an order or show report
 * Uses PizzaOrder and PizzaReceipt, contains main method
 * 
* Creation date: (03/09/11)
* @author: Joel Julag-ay
*/

import javax.swing.JOptionPane;

public class PizzaApp5
{
    //Main constructor.
    public static void main(String[] args)
    {
        String[] buttons = {"Order", "Reports", "Exit"};
		while (true)
		{
			//option dialog
		    int selection = JOptionPane.showOptionDialog(null, "Choose a function", "Bambino's Pizza Application", 
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[0]);
		    	
	    	switch (selection)
	    	{
	    	    case 0:
    	        {
    				PizzaOrder aPo = new PizzaOrder(); //take order
    				aPo.takeOrder();
	    	        break;
    	        }
	    	    case 1:
    	        { 
    	        	CustomerReport aCR = new CustomerReport(); //produce customerreport
					aCR.printReport();
	    	        break;
    	        }
	    	    default:
    	        {
	    	        System.exit(0); //exits program
    	        }
	    	}
		}
    }
}