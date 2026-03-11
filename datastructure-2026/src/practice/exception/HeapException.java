package practice.exception;

import java.io.Serial;

public class HeapException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public HeapException(final String message) {
        super(message);
    }
}
