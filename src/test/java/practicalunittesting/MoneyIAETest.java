package practicalunittesting;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith( JUnitParamsRunner.class )
public class MoneyIAETest {

    private static final int    VALID_AMOUNT   = 5;
    private static final String VALID_CURRENCY = "USD";

    @SuppressWarnings( "unused" )
    private static final Object[] getAmount() {
        return new Integer[][] { { -12387 }, { -5 }, { -1 } };
    }

    @Test( expected = IllegalArgumentException.class )
    @Parameters( method = "getAmount" )
    public void constructorShouldThrowIAEForInvalidAmount( int amount ) {
        new Money( amount, VALID_CURRENCY );
    }

    @SuppressWarnings( "unused" )
    private static final Object[] getCurrency() {
        return new String[][] { { null }, { "" } };
    }

    @Test( expected = IllegalArgumentException.class )
    @Parameters( method = "getCurrency" )
    public void constructorShouldThrowIAEForInvalidCurrency( String currency ) {
        new Money( VALID_AMOUNT, currency );
    }

}
