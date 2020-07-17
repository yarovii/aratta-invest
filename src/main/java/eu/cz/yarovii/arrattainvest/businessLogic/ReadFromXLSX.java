package eu.cz.yarovii.arrattainvest.businessLogic;

import eu.cz.yarovii.arrattainvest.model.Detail;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadFromXLSX {
    private Workbook workbook;
    private Sheet sheet;
    private List<Integer> list;
    private Row row;
    private static ReadFromXLSX single_instance = null;
    private String path = "/static/gost_tables/7062-90.xlsx";

    private ReadFromXLSX() {
        this.list = new ArrayList<>();
    }

    public static ReadFromXLSX getInstance() {
        if (single_instance == null)
            single_instance = new ReadFromXLSX();

        return single_instance;
    }

    private void findSheetIndex(String name){
        for(Sheet sheet: workbook) {
            System.err.println(sheet.getSheetName()+"   SHEET  name      l     here     ..............");
            if(sheet.getSheetName().equals(name)){
                this.sheet = sheet;

                System.err.println(sheet.getSheetName()+"   SHEET        l     here     ..............");
                break;
            }
        }
        System.err.println("   NOOOO SHEET        l     here     ..............");

    }

    public int getRow(String name, Detail detail) throws IOException {
        InputStream excelFile = getClass().getResourceAsStream(path);
        workbook = new XSSFWorkbook(excelFile);
        findSheetIndex(name);

        String s;
        int counter=0;

        row = sheet.getRow(sheet.getFirstRowNum());
        System.err.println("row        l     here     ..............");

        for (Cell cell : row) {
            s = cell.toString();
            if(s.isEmpty()) break;

            if(detail.getDorH() <= (int)Double.parseDouble(s))
                return counter;

            counter++;
        }

        workbook.close();

        return -1;
    }


    public int getColumn(String name, Detail detail) throws IOException {
        InputStream excelFile = getClass().getResourceAsStream(path);
        workbook = new XSSFWorkbook(excelFile);
        findSheetIndex(name);

        String s;

        int index = sheet.getFirstRowNum();
        row = sheet.getRow(index);

        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            row = sheet.getRow(rowIndex);
            if (row != null) {
                Cell cell = row.getCell(index);
                s = cell.toString();
                if(s.isEmpty()) return -1;

                if(detail.getL() <= (int)Double.parseDouble(s))
                    return rowIndex;
            }
            else
                return -1;
        }
        workbook.close();
        return -1;
    }

    public String getAllowance(int r, int c, String s) throws IOException {
        InputStream excelFile = getClass().getResourceAsStream(path);
        workbook = new XSSFWorkbook(excelFile);
        findSheetIndex(s);

        row = sheet.getRow(c);
        s = row.getCell(r).toString();

        workbook.close();
        return s;
    }
}
