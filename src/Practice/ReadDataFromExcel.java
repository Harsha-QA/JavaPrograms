package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ReadDataFromExcel {

	
	public static void main(String[] args)  
	
	{
		File file = new File("C:\\demo\\employee.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			//XSSFWorkbook wb = new XSSFWorkbook(fis);
			//XSSFSheet sheet = wb.getSheetAt(0);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
	}
}
