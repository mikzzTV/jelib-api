package ru.popis.jeapi.api.database.response;

public interface ResponseHandler<H, R> {

    R handleResponse(final H p0) throws Exception;
}
