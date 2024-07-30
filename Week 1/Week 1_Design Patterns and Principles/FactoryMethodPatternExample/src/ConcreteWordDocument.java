// ConcreteWordDocument.java
public class ConcreteWordDocument implements WordDocument {
    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }

    @Override
    public void close() {
        System.out.println("Closing Word document.");
    }

    @Override
    public void save() {
        System.out.println("Saving Word document.");
    }

    @Override
    public void edit() {
        System.out.println("Editing Word document.");
    }
}
