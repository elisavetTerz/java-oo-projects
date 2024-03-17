package gr.aueb.cf.ch18.service.exceptions;

public class IbanNotValidException extends Exception {
    private static final long serialVersionUID = 1L;

    public IbanNotValidException(String iban) {
        super("Iban " + iban + " not valid");
    }

}
