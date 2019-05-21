package practicalunittesting;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static org.junit.Assert.assertEquals;
import static junitparams.JUnitParamsRunner.$;

@RunWith( JUnitParamsRunner.class )
public class MoneyParameterizedSolution2Test {

    private static Object[] getMoney() {
        
        $( 
            $( 10, "USD" ),
            $( 20, "EUR" ),
            $( 30, "XOF" )
        );

    }

    @Test
    @Parameters( method = "getMoney" )
    public void constructorShouldSetAmountAndCurrency( int amount, String currency ) {

        Money money = new Money( amount, currency );
        assertEquals( amount, money.getAmount() );
        assertEquals( currency, money.getCurrency() );

    }

}
