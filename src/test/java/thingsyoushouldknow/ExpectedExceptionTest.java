package thingsyoushouldknow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ExpectedExceptionTest {

    Phone phone = new Phone();

    @Test
    public void shouldThrowIAEForEmptyNumber() {
        try {
            phone.setNumber( null );
            fail( "Should have thrown IllegalArgumentException" );
        } catch ( IllegalArgumentException exception ) {
            assertEquals( "number can not be null or empty", exception.getMessage() );
        }
    }

    @Test
    public void shouldThrowIAEForPlusPrefixedNumber() {
        try {
            phone.setNumber( "+123" );
            fail( "Should have thrown IllegalArgumentException" );
        } catch ( IllegalArgumentException exception ) {
            assertEquals( "plus sign prefix not allowed, number: [ +123 ]", exception.getMessage() );
        }
    }

}
