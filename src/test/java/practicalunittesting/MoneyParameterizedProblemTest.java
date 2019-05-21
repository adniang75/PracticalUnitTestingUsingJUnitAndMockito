package practicalunittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyParameterizedProblemTest {
    
    @Test
    public void constructorShouldSetAmountAndCurrency() {
        
        Money money = new Money( 10, "USD" );
        assertEquals( 10, money.getAmount() );
        assertEquals( "USD", money.getCurrency() );
        
        money = new Money( 20, "EUR" );
        assertEquals( 20, money.getAmount() );
        assertEquals( "EUR", money.getCurrency() );
    }
    
}