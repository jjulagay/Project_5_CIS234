 /** File: MenuIO.java
   * Responsibility: Reads menu.txt, puts data from each line into aMenuItem object
   *
   * Creation date: (2/23/2011)
   * @author: Joel Julag-ay
   */   
import java.io.*; //used to read menu.text
public class MenuIO
{
	public static MenuItem[] getMenuArr()
	{
		MenuItem[] menuArr = new MenuItem[13];
		MenuItem aMenuItem;  //creates aMenuItem object to put lines from text into
		BufferedReader in = null;
		try
		{
			in = new BufferedReader(
					new FileReader("menu.txt"));  //opens menu.txt
			
			//reads lines from menu.text
			String line = in.readLine();
			int i=0;
			while(line != null)
			{
				String[] columns = line.split(",");
				String itemNumStr = columns[0];
				itemNumStr = itemNumStr.trim();
				int itemNum = Integer.parseInt(itemNumStr);
				
				String itemDesc = columns[1];
				itemDesc = itemDesc.trim();
				
				String pcode = columns[2];          
				pcode = pcode.trim();
				
				String itemSize = columns[3];
				itemSize = itemSize.trim();	
				
				String itemCostStr = columns[4];
				itemCostStr = itemCostStr.trim();
				double price = Double.parseDouble(itemCostStr);
				
				aMenuItem= new MenuItem(itemNum, itemDesc, pcode, itemSize, price); 
				menuArr[i] = aMenuItem; //puts data from array into aMenuItem object
				i= i+1;				  //loops to	
				line = in.readLine(); //read next line
			}
			//close menu.txt
			{
				in.close();
			}
		}
		catch(IOException ioe)
		{
			System.out.println("Fail!!!");
		}
		return menuArr;
	}
}
