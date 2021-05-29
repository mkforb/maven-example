package com.ifmo.jjd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by User on 26.05.2021.
 */
public class Application {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.info("Приложение запущено"); // Лог уровня Информация
        Data data = new Data(34, "объект");
        LOGGER.warn(data); // Лог уровня Предупреждение
        System.out.println(data.getNum());
        LOGGER.debug("отладка " + data.getNum()); // Уровень debug, если нужно записать какую-то отладочную информацию

        try {
            String fromFile = Files.readAllLines(Path.of("file.txt")).get(0);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            LOGGER.fatal("Fatal");
        }

        // Log4j-логгер ищет в папке с ресурсами свои настройки в файле с именем log4j2.
        // Расширение файла может быть .xml или .properties или .java. Самый популярный - xml, и самый удобный
        // Если профилей несколько, то будет искать в папке, соответсвующей профилю
        // Настройки могут быть описаны либо
    }
}
