package testdoublesornot;

public class Phone {

    private final boolean mobile;
    private final String  number;

    public Phone( String number, boolean mobile ) {
        this.number = number;
        this.mobile = mobile;
    }

    public boolean isMobile() {
        return this.mobile;
    }
    
    public String getNumber() {
        return this.number;
    }

}
