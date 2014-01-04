 /** File: PizzaApp.java
   * Responsibility: To start the PizzaOrder, now obsolete
   *
   * Creation date: (2/9/2011)
   * @author: Joel Julag-ay

   */   
public class PizzaApp
{
	// Attributes
	
	// Default Constructor
	public PizzaApp(){}
	
	// Methods
	public static void main(String[] args)
		{
			PizzaOrder aPo = new PizzaOrder();
			aPo.takeOrder();
		}
}