package itmo.java.basics.lesson11.factory;

public class CsvConverterFactory implements DocumentConverterFactory{
    @Override
    public DocumentConverter createConverter() {
        return new CsvConverter();
    }
}
