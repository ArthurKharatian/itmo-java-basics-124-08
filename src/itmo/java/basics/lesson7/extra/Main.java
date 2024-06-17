package itmo.java.basics.lesson7.extra;

import itmo.java.basics.lesson7.extra.dao.Document;
import itmo.java.basics.lesson7.extra.service.DocumentService;
import itmo.java.basics.lesson7.extra.service.impl.DocumentServiceImpl;

public class Main {
    public static void main(String[] args) {
        DocumentService documentService = new DocumentServiceImpl();

        System.out.println(documentService.create(10, "pdf", false)); // id = 2
        System.out.println(documentService.create(15, "docx", true)); // id = 3
        System.out.println(documentService.read(1L));


        Document book = new Document(255, "book", false);
        book.setId(2L);

        System.out.println(documentService.update(book));

        documentService.delete(1L);
        documentService.delete(999L);


        System.out.println("\n [All documents] \n");

        for(Document document : documentService.getDocuments()) {
            System.out.println(document);
        }
    }
}
