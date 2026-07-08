package Week1.DesignPatterns;

public class FactoryMethodPattern {
    public static void main(String[] args){
        DocumentFactory wf = new WordFactory();
        DocumentFactory pf = new PdfFactory();
        DocumentFactory ef = new ExcelFactory();

        Document dc = wf.createDocument();
        Document dc1 = pf.createDocument();
        Document dc2 = ef.createDocument();
        dc.open();
        dc1.open();
        dc2.open();
    }
}
class Document{
    public void open(){

    }
}
class wordDocumnet extends Document{
    @Override
    public void open(){
        System.out.println("The Document Opend in Word.");
    }
}
class PdfDocument extends Document{
    @Override
    public void open(){
        System.out.println("The Document Opend in PDF.");
    }
}
class ExcelDocument extends Document{
    @Override
    public void open(){
        System.out.println("Document opend through Excel.");
    }
}
abstract class DocumentFactory{
    public abstract Document createDocument();
}
class WordFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new wordDocumnet();
    }
}
class PdfFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
}
class ExcelFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new ExcelDocument();
    }
}