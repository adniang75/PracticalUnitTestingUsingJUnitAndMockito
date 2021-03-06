package practicalunittesting;

public class Money {

    private final int    amount;
    private final String currency;

    public Money( int amount, String currency ) {
        if ( amount < 0 ) {
            throw new IllegalArgumentException( "illegal amount: [" + amount + "]" );
        }
        if ( currency == null || currency.isEmpty() ) {
            throw new IllegalArgumentException( "illegal currency: [" + currency + "]" );
        }
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    @Override
    public boolean equals( Object anObject ) {
        if ( anObject instanceof Money ) {
            Money money = (Money) anObject;
            return money.getCurrency().equals( this.getCurrency() ) && ( money.getAmount() == this.getAmount() );
        }
        return false;
    }
}
