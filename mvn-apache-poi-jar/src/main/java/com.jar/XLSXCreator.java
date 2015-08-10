package com.jar;

import org.apache.poi.ss.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by zmax.
 */
public class XLSXCreator {

    public Sheet getSheetByName(Workbook wb, String sheetName) {
        if (wb.getSheet(sheetName) == null) {
            return wb.createSheet(sheetName);
        }
        return wb.getSheet(sheetName);
    }

    public void createXLSXFile(Workbook wb, String pathResultFile) {
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream(pathResultFile);
            wb.write(fileOut);
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File created!");
    }

    private CellStyle getCellColor(String res, Workbook wb) {

        CellStyle cs = wb.createCellStyle();
        if (res.equals("true")) {
            cs.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        } else {
            cs.setFillForegroundColor((IndexedColors.CORAL.getIndex()));
        }
        cs.setFillPattern(CellStyle.BORDER_THIN);
        return cs;
    }

}
