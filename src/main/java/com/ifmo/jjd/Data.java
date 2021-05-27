package com.ifmo.jjd;

/**
 * Created by User on 26.05.2021.
 */
// Документировать можно сам класс, все свойства, методы
// /** */ это документация

/**
 * Класс com.ifmo.jjd.Data используется для...
 * @author Alexander
 * @version 1.0
 * */
public class Data {
    /** поле num для... */
    private int num;
    /** поле name для... */
    private String name;

    /**
     * Конструктор
     * @param num - параметр...
     * @param name - параметр...
     * @see Data#Data(int, String)
     */
    public Data(int num, String name) {
        this.num = num;
        this.name = name;
    }

    /**
     * Метод getNum {@link Data#num}
     * @return возвращает значение num
     */
    public int getNum() {
        return num;
    }

    /**
     * Метод setNum {@link Data#num}
     * @param num - параметр...
     * @throws Exception - описание исключения
     */
    public void setNum(int num) throws Exception {
        this.num = num;
    }
}
