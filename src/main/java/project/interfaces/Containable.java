package project.interfaces;

public interface Containable {

//добавляет что-то (например, воду, песок) в контейнерный объект
    void addStuff (Transformable stuff);

//удаляет все
    Transformable removeStuff();

//возвращает true, если внутри ничего нет
    boolean isEmpty();

//возвращает целое число свободных миллилитров
    int getFreeSpace();

//принудительное открытие контейнера
    void open();

//принудительно закрывает контейнер
    void close();

}
