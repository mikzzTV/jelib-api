package ru.popis.jeapi.api.database.adapter;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.function.Consumer;
import java.util.function.Function;

public interface SQLTypeAdapter<T> {

    Function<ResultSet, T> read() throws Exception;

    Consumer<T> write(PreparedStatement preparedStatement) throws Exception;

}
