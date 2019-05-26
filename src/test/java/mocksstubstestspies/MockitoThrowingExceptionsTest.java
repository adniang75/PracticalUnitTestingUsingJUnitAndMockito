package mocksstubstestspies;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MockitoThrowingExceptionsTest {
    
    private Car myFerrari = mock( Car.class );
    
    @Test( expected = RuntimeException.class )
    public void throwException() {
        when( myFerrari.needFuel() )
        .thenThrow( new RuntimeException() );
        
        myFerrari.needFuel();
    }

}
