 /** File: Price4.java
   * Responsibility: Extends Price class, use MenuIO to fill MenuArray with data objects, returns price
   *
   * Creation date: (2/23/2011)
   * @author: Joel Julag-ay
   */   

public class Price4 extends Price //extends Price class
{
	public static double getPrice (String type)
	{
		MenuItem[] menuArr = MenuIO.getMenuArr(); 
		for(int i=0; i < menuArr.length ; i++)
		{
			String pcode = menuArr[i].getpcode();  //create String pcode (LCS, LCP, etc...) from menu.text
			if (pcode.equals(type)) //checks if pcode from menutext equals pizza type user entered
				{
				return menuArr[i].getprice(); //returns price if code = pizza type
				}
		}		
	return 8888;
	}
}
