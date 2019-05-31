package thingsyoushouldknow;

public class Phone {

    private String number;

    public Phone() {
        super();
    }

    public void setNumber( String number ) {
        if ( number == null || number.isEmpty() ) {
            throw new IllegalArgumentException( "number can not be null or empty" );
        }
        if ( number.startsWith( "+" ) ) {
            throw new IllegalArgumentException( "plus sign prefix not allowed, number: [ " + number + " ]" );
        }
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

}
