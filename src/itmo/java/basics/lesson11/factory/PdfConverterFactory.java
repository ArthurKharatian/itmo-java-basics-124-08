package itmo.java.basics.lesson11.factory;

public class PdfConverterFactory implements DocumentConverterFactory{
    @Override
    public DocumentConverter createConverter() {
        return new PdfConverter();
    }
}
