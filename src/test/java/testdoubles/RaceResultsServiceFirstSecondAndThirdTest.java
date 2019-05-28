package testdoubles;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class RaceResultsServiceFirstSecondAndThirdTest {
    
    private RaceResultsService raceResults = new RaceResultsService();
    
    private Message message = mock( Message.class );
    
    private Client clientA = mock( Client.class, "clientA" );
    private Client clientB = mock( Client.class, "clientB" );

    @Test
    public void subscribedClientShouldReceiveMessage() {

        raceResults.addSubscriber( clientA );
        raceResults.send( message );

        verify( clientA ).receive( message );

    }

    @Test
    public void messageShouldBeSentToAllSubscribedClients() {

        raceResults.addSubscriber( clientA );
        raceResults.addSubscriber( clientB );

        raceResults.send( message );

        verify( clientA ).receive( message );
        verify( clientB ).receive( message );

    }
    
    @Test
    public void notSubscribedClientShouldReceiveMessage() {
        
        raceResults.send( message );
        
        verify( clientA, never() ).receive( message );
        verify( clientB, never() ).receive( message );
        
    }
    
}
