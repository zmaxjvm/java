package com.jar;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

/**
 * Created by zmax.
 */
public class AppTest {

    XLSXCreator xlsxCreator = new XLSXCreator();

    @Test
    public void testWriteDataByColumnNumber() {

        Workbook wb = new XSSFWorkbook();
        Sheet sheet = xlsxCreator.getSheetByName(wb, "Test Results");

        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Info");
        row.createCell(1).setCellValue("Test 1");

        Row row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("test 1");

        Row row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("test 2");

        Row row3 = sheet.createRow(3);
        row3.createCell(0).setCellValue("test 3");

        xlsxCreator.createXLSXFile(wb, "C:\\TMP\\Test.xlsx");
    }

}


