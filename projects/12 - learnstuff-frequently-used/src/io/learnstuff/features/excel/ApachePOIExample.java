package io.learnstuff.features.excel;

public class ApachePOIExample {

  public static void main(String[] args) {
    ExcelProcessor excelProcessor = new ExcelProcessor();
    excelProcessor.createExcelFile();
    excelProcessor.readExcelFile();
  }
}
