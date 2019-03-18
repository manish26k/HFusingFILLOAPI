package HybridFramework.excelReader;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class HybridFramework_Excel
{

	public String[][] getExcelData(String excellocation, String sheetName) throws FilloException
	{
		String dataSets[][] = new String[10][];
		Fillo fillo= new Fillo();
		Connection connection= fillo.getConnection(excellocation);
		
		
		
		String strQuery= "Select * from LoginTestData";
		Recordset rs=connection.executeQuery(strQuery);
		int i=0;
		while(rs.next())
		{
			
			if(rs.getField("userName").length()>2) {
			dataSets[i]=new String[3];
			dataSets[i][0]=rs.getField("userName");
			dataSets[i][1]=rs.getField("password");
			dataSets[i][2]=rs.getField("runMode");
			
			System.out.println(rs.getField("userName")+"----"+rs.getField("password")+"---"+rs.getField("runMode"));
			i++;
			}
			else
				break;
		}
		
		rs.close();
		connection.close();
		
		
		return dataSets;
	}
	
	
}
