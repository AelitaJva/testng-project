package com.automation.testcases;

import com.ebay.LoginFeature;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataDrivenTestExcel {
    LoginFeature loginFeature = new LoginFeature();

    @Test(dataProvider =  "invalidData")
    public void verifyLoginUnsuccessfulWithInvalidCredentials (String username, String password) {
        // Testing the method with Test Data
        boolean result = loginFeature.doLogin(username, password);

        // Checking the output
        Assert.assertEquals(result, false);
    }

    @DataProvider(name = "invalidData")
    public Object [][] getData () throws IOException {


        Object [][] credentials = new Object[10][2];

        XSSFWorkbook workbook = new XSSFWorkbook("src/test/resources/data/data.xlsx");

        // Open Excel Sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        for (int i=0; i<sheet.getPhysicalNumberOfRows(); i++) {
            XSSFRow row = sheet.getRow(i);
            XSSFCell cell = row.getCell(0);
            XSSFCell cell2 = row.getCell(1);
            credentials[i] [0] = cell.getStringCellValue();
            credentials[i][1] = cell2.getStringCellValue();
        }

        return credentials;
    }

    @Test
    public void verifyLoginSuccessfulWithValidCredentials () {

    }
}
