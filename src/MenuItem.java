 /** File: MenuItem.java
   * Responsibility: Data Class for MenuItem
   *
   * Creation date: (2/23/2011)
   * @author: Joel Julag-ay
   */   

public class MenuItem
{
	//attributes
	private int itemNum;
	private String itemDesc;
	private String pcode;
	private String itemSize;
	private double price;
	
	//constructor
	public MenuItem(int itemNum, String itemDesc, String pcode,
			String itemSize, double price)
	{
		super();
		this.itemNum = itemNum;
		this.itemDesc = itemDesc;
		this.pcode = pcode;
		this.itemSize = itemSize;
		this.price = price;
	}
	
	//generated getters and setters
	public int getItemNum()
	{
		return itemNum;
	}
	public void setItemNum(int itemNum)
	{
		this.itemNum = itemNum;
	}
	public String getItemDesc()
	{
		return itemDesc;
	}
	public void setItemDesc(String itemDesc)
	{
		this.itemDesc = itemDesc;
	}
	public String getpcode()
	{
		return pcode;
	}
	public void settype(String pcode)
	{
		this.pcode = pcode;
	}
	public String getItemSize()
	{
		return itemSize;
	}
	public void setItemSize(String itemSize)
	{
		this.itemSize = itemSize;
	}
	public double getprice()
	{
		return price;
	}
	public void setprice(double price)
	{
		this.price = price;
	}
	
	// Generated To String
	@Override
	public String toString()
	{
		return "MenuItem [itemNum=" + itemNum + ", itemDesc=" + itemDesc + 
		", pcode=" + pcode + ", itemSize=" + itemSize + "price=" + price + ",  ]";
	}		
}
