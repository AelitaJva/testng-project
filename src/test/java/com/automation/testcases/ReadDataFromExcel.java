package com.automation.testcases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.xml.xpath.XPath;

public class ReadDataFromExcel {
    public static void main(String[] args) throws Exception {
        // Open Excel File
        XSSFWorkbook workbook = new XSSFWorkbook("src/test/resources/data/data.xlsx");

        // Open Excel Sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        for (int i=0; i<sheet.getPhysicalNumberOfRows(); i++) {
            XSSFRow row = sheet.getRow(i);
            XSSFCell cell = row.getCell(0);
            XSSFCell cell2 = row.getCell(1);

            System.out.println(cell.getStringCellValue() + "   " + cell2.getStringCellValue());
        }

    }
}
