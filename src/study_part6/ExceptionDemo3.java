package study_part6;

/**
 * Created by biz on 2018/8/21.
 */


public class ExceptionDemo3 extends Exception {

    public ExceptionDemo3() {
    }

    public ExceptionDemo3(String message) {
        super(message);
    }

    public ExceptionDemo3(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionDemo3(Throwable cause) {
        super(cause);
    }

    public ExceptionDemo3(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
