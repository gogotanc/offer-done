package org.offer.utils.exception;

/**
 * 非法操作错误
 * Created by tanc on 17-5-7.
 */
public class IllegalOperationException extends RuntimeException {

    public IllegalOperationException() {
        super();
    }

    public IllegalOperationException(String message) {
        super(message);
    }
}
