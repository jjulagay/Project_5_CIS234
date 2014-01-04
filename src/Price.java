 /** File: Price.java
   * Responsibility: Computes the cost of a pizzaType (called type) via if and switch statements
   *
   * Creation date: (2/9/2011)
   * @author: Joel Julag-ay

   */   
public class Price
{
	public static double getPrice(String type)
		{
			type = type.toUpperCase();
			type = type.trim();
			
			char firstChar = type.charAt(0);
			switch(firstChar)
			{
				case 'L':
				{
					if(type.equals("LC"))
						return 14.95;
					if(type.equals("LCS"))
						return 15.95;
					if(type.equals("LCP"))
						return 16.95;
					if(type.equals("LCV"))
						return 15.95;
					break;
				}
				
				case 'M':
				{
					if(type.equals("MC"))
						return 13.95;	
					if(type.equals("MCS"))
						return 14.95;
					if(type.equals("MCP"))
						return 15.95;
					if(type.equals("MCV"))
						return 13.95;
					break;
				}
				
				case 'S':
				{
					if(type.equals("SC"))
						return 12.95;
					if(type.equals("SCS"))
						return 13.95;
					if(type.equals("SCP"))
						return 13.95;
					if(type.equals("SCV"))
						return 12.95;
				}
			}
			return 9999;
		}
}