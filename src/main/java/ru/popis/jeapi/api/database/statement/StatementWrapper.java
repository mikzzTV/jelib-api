package ru.popis.jeapi.api.database.statement;

import ru.popis.jeapi.api.database.response.ResponseHandler;

import java.sql.ResultSet;

public interface StatementWrapper {

    int execute(int generatedKeys, Object... objects);

    <T> T executeQuery(ResponseHandler<ResultSet, T> handler, Object... objects);

    boolean isAsync();

}
