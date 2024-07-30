// DocumentFactory.java
public abstract class DocumentFactory {
    public abstract Document createDocument();

    public Document createAndOpenDocument() {
        Document document = createDocument();
        document.open();
        return document;
    }
}
