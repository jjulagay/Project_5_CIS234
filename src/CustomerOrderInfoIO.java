/** class CustomerOrderInfoIO -- provides read and write methods for customer.txt
 * 
* Creation date: (03/09/11)
* @author: Joel Julag-ay
*/
import java.io.*; //used to import reader/writer classes
import java.util.*; //used for arraylist

public class CustomerOrderInfoIO
{
	public boolean storeCustomerInfo (String phoneNum, String custName, String type, int pizzas) //write method for customer.txt
	{
		try
		{
			PrintWriter out = new PrintWriter(
					new BufferedWriter(
					new FileWriter("Customer.txt", true))); //true appends to file
			out.println(phoneNum + ",  " + custName + ",  " + type	 + ",  " + pizzas);
            out.close(); //closes file
        }
		catch(IOException ioe)
		{
			System.out.println("Fail!!!");
		}
		return true;
	}
	
	public static ArrayList<CustomerOrderInfo> getCustomerOrderInfo() //read method for customer.txt
	{
		ArrayList<CustomerOrderInfo> custOrderInfoArr = new ArrayList<CustomerOrderInfo>();
		CustomerOrderInfo aCustOrderInfoObj;  //creates aCustOrderInfoObj object to put lines from text into
		BufferedReader in = null;
		try
		{
			in = new BufferedReader(
					new FileReader("Customer.txt"));  //opens Customer.txt
			
			//reads lines from Customer.txt
			String line = in.readLine();
			while(line != null)
			{
				String[] columns = line.split(",");
				String phoneNum = columns[0];
				phoneNum = phoneNum.trim();
				String custName = columns[1];
				custName = custName.trim();
				String type = columns[2];
				type = type.toUpperCase();
				type = type.trim();
				String pizzasStr = columns[3];
				pizzasStr = pizzasStr.trim();
				int pizzas = Integer.parseInt(pizzasStr);
				
				aCustOrderInfoObj = new CustomerOrderInfo(phoneNum, custName, type, pizzas); 
				custOrderInfoArr.add(aCustOrderInfoObj);
				line = in.readLine(); //read next line
			}

			{
				in.close();  //close customer
			}
		}
		catch(IOException ioe)
		{
			System.out.println("Fail!!!");
		}
		return custOrderInfoArr;
	}
}
