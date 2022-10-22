package ru.popis.jeapi.api.database;

import ru.popis.jeapi.api.database.adapter.SQLTypeAdapter;
import ru.popis.jeapi.api.database.connection.ConnectionWrapper;
import ru.popis.jeapi.api.database.response.ResponseHandler;
import ru.popis.jeapi.api.database.statement.StatementWrapper;

import java.sql.ResultSet;

public interface Database {

    ConnectionWrapper getConnectionWrapper();

    int execute(String action, Object... args);

    int execute(StatementWrapper statementWrapper, Object... args);

    <T> T executeQuery(String query, ResponseHandler<ResultSet, T> handler, Object... args);

    <T> T executeQuery(StatementWrapper statementWrapper, ResponseHandler<ResultSet, T> handler, Object... args);

    <T extends SQLTypeAdapter> boolean registerTypeAdapter(Class<?> clazz, T instance);


}
