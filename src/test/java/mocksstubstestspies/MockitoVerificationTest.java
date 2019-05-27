package mocksstubstestspies;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class MockitoVerificationTest {
    
    private Car myFerrari = mock( Car.class );
    
    @Test
    public void testVerification() {
        
        myFerrari.driveTo( "Sweet home Alabama" );
        myFerrari.needFuel();
        
        verify( myFerrari ).driveTo( "Sweet home Alabama" );
        verify( myFerrari ).needFuel();
        
    }

}
