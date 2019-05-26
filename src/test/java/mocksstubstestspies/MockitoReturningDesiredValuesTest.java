package mocksstubstestspies;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MockitoReturningDesiredValuesTest {
    
    private Car myFerrari = mock( Car.class );
    
    @Test
    public void testStubbing() {
        assertFalse( "new test double should return false as boolean", myFerrari.needFuel() );
        when( myFerrari.needFuel() ).thenReturn( true );
        assertTrue( "after instructed test double should return what we want", myFerrari.needFuel() );
    }

}
