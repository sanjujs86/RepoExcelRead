package Package1;

import java.io.IOException;

public class ExcelAReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExcelA obj = new ExcelA();
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<=2;j++)
			{
		     String value = obj.readData(i, j);
		     System.out.println(value);
			}
		}
	}

}
