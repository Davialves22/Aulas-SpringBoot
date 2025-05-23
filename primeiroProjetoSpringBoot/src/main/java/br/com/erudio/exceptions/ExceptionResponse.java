package br.com.erudio.exceptions;

import java.io.Serializable;
import java.sql.Date;

public class ExceptionResponse implements Serializable {

    private static final long seriaVersionUID = 1l;

    private Date timestamp;
    private String message;
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

}
