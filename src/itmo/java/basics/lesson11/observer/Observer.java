package itmo.java.basics.lesson11.observer;

import java.util.List;

public interface Observer {
    void handelEvent(List<String> vacancies);
}
