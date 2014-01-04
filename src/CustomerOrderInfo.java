/** class CustomerOrderInfo-- data class for CustomerOrder
 * 
* Creation date: (03/09/11)
* @author: Joel Julag-ay
*/
public class CustomerOrderInfo
{
	//Attributes
	private String phoneNum;
	private String custName;
	private String type;
	private int pizzas;
	
	//auto generated contructor
	public CustomerOrderInfo(String phoneNum, String custName, String type,
			int pizzas)
	{
		super();
		this.phoneNum = phoneNum;
		this.custName = custName;
		this.type = type;
		this.pizzas = pizzas;
	}
	
	//auto generated getters and setters
	public String getphoneNum()
	{
		return phoneNum;
	}
	public void setphoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public String getcustName()
	{
		return custName;
	}
	public void setcustName(String custName)
	{
		this.custName = custName;
	}
	public String gettype()
	{
		return type;
	}
	public void settype(String type)
	{
		this.type = type;
	}
	public int getpizzas()
	{
		return pizzas;
	}
	public void setpizzas(int pizzas)
	{
		this.pizzas = pizzas;
	}
	
	//auto generated to string
	@Override
	public String toString()
	{
		return "CustomerOrderInfo [phoneNum=" + phoneNum + ", custName="
				+ custName + ", type=" + type + ", pizzas="
				+ pizzas + "]";
	}
}
