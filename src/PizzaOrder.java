 /** File: PizzaOrder.java
   * Responsibility: To take an order and be the user interface, have the receipt printed, and take the price.
   * To take data and store to customer.txt using customerorderinfoio
   *
   * Creation date: (2/9/2011)
   * Modified: (2/23/11) Updated to reflect new Price4 class
   * 			(3/9/11) Updated to save data to customer.txt
   * @author: Joel Julag-ay

   */   

import javax.swing.JOptionPane;

public class PizzaOrder
{
	 //Default Constructor
	public PizzaOrder(){}
	
	 // Methods
     public void takeOrder()
     	{
    		String manName;
    		String type;
    		int pizzas;
    		double price;
    		String toppingStr;
    		String phoneNum;
    		String custName;
    		
			PizzaReceipt aPr = new PizzaReceipt();
			CustomerOrderInfoIO aCOI = new CustomerOrderInfoIO();

    	 	manName = JOptionPane.showInputDialog("Enter Manager Name");
			aPr.writeHeader(manName);

			String isCust = JOptionPane.showInputDialog("Is there a customer?" + "\n" + "yes/no");

			while(isCust.equalsIgnoreCase("yes")) //start outer loop
			{	
				String custAns = JOptionPane.showInputDialog("Hello, do you want to order?" + "\n" + "yes/no");
				
				while(custAns.equalsIgnoreCase("yes")) //start inner loop
				{
					custName = JOptionPane.showInputDialog("Whats your name?"); //asks for custname
					phoneNum = JOptionPane.showInputDialog("Whats your phone number?"); //asks for phonenum
		    	 	type= JOptionPane.showInputDialog("What pizza type?"); //asks pizza type
		    	 	type = type.toUpperCase();		    	 	
		    	 	String pizzaStr= JOptionPane.showInputDialog("How many?");
			    	pizzas = Integer.parseInt(pizzaStr);			    	 //converts pizzaStr to integer
			    	toppingStr = JOptionPane.showInputDialog("What toppings?");
			    	toppingStr = toppingStr.toUpperCase(); //end of toppings
				    price = Price4 .getPrice(type); //uses price4 to calculate price given a type
					aPr.writeDetailLines(type, pizzas, toppingStr, price);
					custAns = JOptionPane.showInputDialog("Do you want to order another?" + "\n" + "yes/no");
					aCOI.storeCustomerInfo(phoneNum, custName, type, pizzas); //writes to customer.txt
				} //end of inner loop
				aPr.writeTotalLines();
				isCust = JOptionPane.showInputDialog("Is there another customer?" + "\n" + "yes/no");
			} //end of outer loop

     	}
}