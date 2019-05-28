package testdoubles;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;


public class RaceResultsServiceFirstAndSecondTest {
    
    @Test
    public void subscribedClientShouldReceiveMessage() {
        
        RaceResultsService raceResults = new RaceResultsService();
        
        Client client = mock( Client.class );
        Message message = mock( Message.class );
        
        raceResults.addSubscriber( client );
        raceResults.send( message );
        
        verify( client ).receive( message );
        
    }

}
