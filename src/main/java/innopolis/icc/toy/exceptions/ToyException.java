package innopolis.icc.toy.exceptions;


public class ToyException extends Exception {
    static final long serialVersionUID = 78183234758280155L;

    public ToyException(String message, Throwable cause) {
        super(message, cause);
    }

    public ToyException(){super();}

    public ToyException(String msg){super(msg);}

    public ToyException(Exception ex){super(ex);}

    public ToyException(Throwable cause) {super(cause);}

}
