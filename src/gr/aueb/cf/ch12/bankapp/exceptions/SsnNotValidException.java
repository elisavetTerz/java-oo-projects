package gr.aueb.cf.ch12.bankapp.exceptions;

public class SsnNotValidException extends Exception {
    private static final long serialVersionUID = 1L;

    public SsnNotValidException(long ssn) {
        super("Ssn " + ssn + " not valid");
    }
}
