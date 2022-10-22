package ru.popis.jeapi.api.database.connection;

import java.sql.PreparedStatement;
import java.util.function.Function;

public interface ConnectionWrapper {

    Function<String, PreparedStatement> prepareStatement() throws Exception;

    Function<String, PreparedStatement> prepareStatement(int generatedKeys) throws Exception;

}
