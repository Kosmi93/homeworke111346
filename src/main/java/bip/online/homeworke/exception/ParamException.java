package bip.online.homeworke.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
public class ParamException extends RuntimeException{
    public ParamException() {
    }

    public ParamException(String message) {
        super(message);
    }
}
