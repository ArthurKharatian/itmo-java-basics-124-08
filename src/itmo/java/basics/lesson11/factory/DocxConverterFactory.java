package itmo.java.basics.lesson11.factory;

public class DocxConverterFactory implements DocumentConverterFactory{
    @Override
    public DocumentConverter createConverter() {
        return new DocxConverter();
    }
}
