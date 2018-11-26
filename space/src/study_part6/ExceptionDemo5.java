package study_part6;

/**
 * Created by biz on 2018/8/22.
 */


public class ExceptionDemo5 extends RuntimeException{

    private static final long serialVersionUID = -7034897190745766939L;

    public ExceptionDemo5() {
    }

    public ExceptionDemo5(String message) {
        super(message);
    }

    public ExceptionDemo5(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionDemo5(Throwable cause) {
        super(cause);
    }

    public ExceptionDemo5(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
