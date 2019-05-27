package mocksstubstestspies;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class MockitoVerificationFailure {
    
    private Car myFerrari = mock( Car.class );
    
    @Test
    public void testVerificationFailure() {
        
        myFerrari.needFuel();
        verify( myFerrari ).getEngineTemperature();
        
    }

}
