package itmo.java.basics.lesson7.extra.service;

import itmo.java.basics.lesson7.extra.dao.Document;

import java.util.List;

public interface DocumentService {
    // CRUD Create Read Update Delete
    Document create(Integer pageCount, String format, Boolean isEditable);

    Document read(Long id);

    Document update(Document document);

    void delete(Long id);

    List<Document> getDocuments();
}
