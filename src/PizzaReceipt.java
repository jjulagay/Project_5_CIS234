 /** File: PizzaReceipt.java
   * Responsibility: Compute the cost of ordering a pizza and produces a receipt
   *
   * Creation date: (2/9/2011)
   * @author: Joel Julag-ay

   */   
import java.text.NumberFormat;

public class PizzaReceipt
{
	// Attributes 
	private double subtotal = 0;

	//Default Constructor
	public PizzaReceipt(){}
	
	// Methods 	
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	public void writeHeader(String manName) 
		{
			System.out.println("Bambino's Pizza - Branch Manager " + manName);
		}
	
    public void writeDetailLines(String type, int pizzas, String toppingStr, double price) 
    	{ 
    		double totalPizzaCost= pizzas * price;
    		    System.out.println("\n" + "Pizza " + type + " number " + pizzas + " @ " + price + " = " + currency.format(totalPizzaCost));
    	    
    		double extraTopCost= toppingStr.length()*.50;
    			System.out.println("Extra toppings = " + toppingStr + " @ $00.50 = " + currency.format(extraTopCost));
    		
    		double toppingCost= extraTopCost*pizzas;
    			System.out.println("Topping Cost = " + currency.format(toppingCost));
    			
    		subtotal= subtotal + toppingCost + totalPizzaCost;
    	}	
    
    public void writeTotalLines()
    	{
	    	System.out.println("\n" + "Subtotal Amount = " + currency.format(subtotal));
	    	
	    	System.out.println("Tax at 8% = " + currency.format(subtotal*.08));	
	    	
	    	double finalCost= (subtotal*.08 + subtotal);
	    		System.out.println("Final Cost = " + currency.format(finalCost));
    	}
}	