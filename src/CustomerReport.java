/** class CustomerReport -- produces customerreport using customer.txt
 * Produces a report using JOptionPane, uses CustomerOrderInfoIO class for its 
 * getCustomerOrderInfo method, reads custom.txt
* Creation date: (03/09/11)
* @author: Joel Julag-ay
*/

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class CustomerReport
{
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	public void printReport() //method to print customerreport, reads customer.txt, and produces dialog to show custreport
	{
		String outStr = "Bambino's Customer Report" + "\n" + 
						"Customers  PizzaType  NumPizza  Price  ExtendedPrice" + "\n";
		
		ArrayList<CustomerOrderInfo> aAL = CustomerOrderInfoIO.getCustomerOrderInfo(); //creates aAL to access customer.txt
		double total = 0;

		for (int i=0; i< aAL.size(); i++) //for loop to write lines of customerreport
			{
				CustomerOrderInfo aCIO = aAL.get(i);
				String type = aCIO.gettype();
				double price = Price4.getPrice(type);
				double extendedPrice = price * aCIO.getpizzas();
				total = total + extendedPrice;
				outStr = outStr + aCIO.getcustName() + "   " + aCIO.gettype() + "   "  + aCIO.getpizzas()
								+ "  " + currency.format(price) + "  " + currency.format(extendedPrice) + "\n";
			}
		
		outStr = outStr + "Total Pizza Income = " + currency.format(total);
		JOptionPane.showMessageDialog(null, outStr); //provides message dialog box, displays variable outStr
														//which includes custname, type, # pizzas, and extended price
	}
}
