// Document.java
public class Main {
    public static void main(String[] args) {
        // Create Word document
        DocumentFactory wordFactory = new WordDocumentFactory();
        WordDocument wordDocument = (WordDocument) wordFactory.createAndOpenDocument();
        wordDocument.edit();
        wordDocument.save();
        wordDocument.close();

        // Create PDF document
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        PdfDocument pdfDocument = (PdfDocument) pdfFactory.createAndOpenDocument();
        pdfDocument.print();
        pdfDocument.save();
        pdfDocument.close();

        // Create Excel document
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        ExcelDocument excelDocument = (ExcelDocument) excelFactory.createAndOpenDocument();
        excelDocument.calculate();
        excelDocument.save();
        excelDocument.close();
    }
}
