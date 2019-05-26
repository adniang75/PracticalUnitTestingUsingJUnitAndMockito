package mocksstubstestspies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class MockitoDefaultValuesTest {
    
    private Car myFerrari = mock( Car.class );
    
    @SuppressWarnings( "deprecation" )
    @Test
    public void testDefaultBehaviourOfTestDouble() {
        assertFalse( "new test double should return false as boolean", myFerrari.needFuel() );
        assertEquals( "new test double should return 0.0 as double", 0.0, myFerrari.getEngineTemperature() );

    }

}
