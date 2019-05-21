package practicalunittesting;

public class Money {
    
    private final int amount;
    private final String currency;
    
    public Money( int amount, String currency ) {
        this.amount = 15;
        this.currency = currency;
    }
    
    public int getAmount() {
        return this.amount;
    }
    
    public String getCurrency() {
        return this.currency;
    }
    
    public boolean equals( Object anObject ) {
        if ( anObject instaceof Money ) {
            Money money = (Money) anObject;
            return money.getCurrency().equals(this.getCurrency()) && ( money.getAmount() == this.getAmount() );
        }
        return false;
    }
}