package ExcelReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// please check the Navigate package in that NaviagateMethods


public class DDF
{
	public static Workbook wb;
	public static FileInputStream fis;

	public static void fileReading(String filename) throws EncryptedDocumentException, InvalidFormatException
	{
		// System.out.println(filename);
		try
		{
			fis = new FileInputStream("./excels/" + filename);
			wb = WorkbookFactory.create(fis);

		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getTestSheetName(String testcase)
	{

		Sheet sheetName = wb.getSheet("overview"); // first sheet
		int totalRows = sheetName.getLastRowNum();
		// System.out.println(totalRows);

		// Row starts from 1 as first row is header
		for (int row = 1; row <= totalRows; row++)
		{
			// System.out.println(sheetName.getRow(row).getCell(1).toString());
			if (testcase.equalsIgnoreCase(sheetName.getRow(row).getCell(1).toString()))
			{
				return sheetName.getRow(row).getCell(0).toString();
			}
		}
		return "Testcase Not Found";
	}
	
	public void setTestCaseStatus(String testcasename,String status)
	{

		Sheet sheetName = wb.getSheet("overview"); // first sheet
		int totalRows = sheetName.getLastRowNum();
		try
		{
			FileOutputStream fos = new FileOutputStream("./excels/aaa.xlsx");
			// System.out.println(totalRows);
			// Row starts from 1 as first row is header
			for (int row = 1; row <= totalRows; row++)
			{
				if (testcasename.equalsIgnoreCase(sheetName.getRow(row).getCell(1).toString()))
				{
				// System.out.println(sheetName.getRow(row).getCell(1).toString());
					sheetName.getRow(row).createCell(2).setCellValue(status);
				}
			}
			wb.write(fos);
			wb.close();

		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
//		// System.out.println(totalRows);
//
//		// Row starts from 1 as first row is header
//		for (int row = 1; row <= totalRows; row++)
//		{
//			// System.out.println(sheetName.getRow(row).getCell(1).toString());
//			sheetName.getRow(row).createCell(2).setCellValue(status);
//		}
	}


	/**
	 * 
	 * @param testcase
	 * @return
	 */
	public String getRow(String testcase, String testdatavariable)
	{
		Map<String, String> testData = new HashMap<String, String>();
		String testSheetName = getTestSheetName(testcase);
		// System.out.println(testSheetName);
		Sheet testSheet = wb.getSheet(testSheetName);
		String variablename;
		int totalRows = testSheet.getLastRowNum();
		int totalCells = testSheet.getRow(0).getLastCellNum();
		// System.out.println(totalRows);
		// System.out.println(totalCells);
		// Row starts from 1 as first row is header
		for (int row = 1; row <= totalRows; row++)
		{
			// System.out.println(testSheet.getRow(row).getCell(0).toString());
			for (int cel = 1; cel < totalCells;cel++)

			{

				// int totalCells = testSheet.getRow(row).getLastCellNum();

				if (testcase.equalsIgnoreCase(testSheet.getRow(row).getCell(0).toString()))
				{
					// First column shows the scenario name.
					if (testSheet.getRow(row).getCell(cel) == null)
					{
						variablename = "";
					}

					else
					{
						variablename = testSheet.getRow(row).getCell(cel).toString();
						// System.out.println(cellData);
					}

					String variablevalue = testSheet.getRow(row).getCell(2).toString();
					// System.out.println(celllName);
					testData.put(variablename, variablevalue);

				}
				break;
			}
		}

		String value = "";
		for (String keys : testData.keySet())
		{

			if (testdatavariable.equals(keys))
				value = testData.get(testdatavariable);

		}
		return value;

	}

	public static void main(String[] args) throws EncryptedDocumentException, Exception, IOException
	{
		fileReading("aaa.xlsx");
		DDF ddf = new DDF();
		// System.out.println(ddf.getTestSheetName("krishna"));
		String testData = ddf.getRow("aaaa", "xx130");
		System.out.println(testData);
		ddf.setTestCaseStatus("aaaa","pass");

	}

}
