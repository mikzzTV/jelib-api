package ru.popis.jeapi.api.database;

import java.io.File;

public interface DatabaseAPI {

    Database getDatabase(String database, String username, String password);

    Database getDatabase(File file);

}
