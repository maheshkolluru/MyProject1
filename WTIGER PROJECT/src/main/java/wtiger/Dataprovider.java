package wtiger;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	@DataProvider(name="campaign")
public Object createcampaignmultidata() throws Throwable, IOException {
		Object obj[][];
		DataFormatter df = new DataFormatter();
		FileInputStream fis =new FileInputStream(iconstant.excelpath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sheet1");
		obj=new Object[sh.getLastRowNum()][4];
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			for(int j=0;j<4;j++)
			{
		obj[i-1][j]	=df.formatCellValue(sh.getRow(i).getCell(j));
			}
			
		}
		return obj;
		
		
	}

}
