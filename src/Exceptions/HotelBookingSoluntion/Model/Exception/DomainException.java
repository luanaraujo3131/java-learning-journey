package Exceptions.HotelBookingSoluntion.Model.Exception;

public class DomainException extends Exception{

    private static final long serialVersioUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
