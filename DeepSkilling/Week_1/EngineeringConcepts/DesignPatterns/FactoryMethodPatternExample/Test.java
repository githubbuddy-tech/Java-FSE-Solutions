
public class Test {
    public static void main(String[] args) {
           DocumentFactory factory=new ExcelDocumentFactory();
           Document excelDoc=factory.createDocument();
           excelDoc.open();

           factory=new PdfDocumentFactory();
           Document pdfDoc=factory.createDocument();
           pdfDoc.open();

           factory=new WordDocumentFactory();//
           Document wordDoc=factory.createDocument();
           wordDoc.open();





        }
    }
