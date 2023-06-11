package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteIntoAnExistingExcelFile {
    public static void main(String[] args) {
        String path = "src/test/java/ApachePOI/Resources/WriteIntoAnExcelFile.xlsx";
        Sheet sheet;
        Workbook workbook;
        FileInputStream inputStream;
        FileOutputStream outputStream;
        try {
            inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet("Sheet1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // We made changes  in the memory not in the file
        Row row = sheet.createRow(0); // created a new row
        Cell cell = row.createCell(0); // created a new cell
        cell.setCellValue("Hello World!");  // typed the value in the cell

        for (int i = 1; i < 10; i++) {
            row.createCell(i).setCellValue(i);
        }
        try {
            inputStream.close();
            outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
