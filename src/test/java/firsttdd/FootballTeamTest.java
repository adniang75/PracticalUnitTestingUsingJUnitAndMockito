package firsttdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith( JUnitParamsRunner.class )
public class FootballTeamTest {
    
    private static final int ANY_NUMBER = 123;

    @SuppressWarnings( "unused" )
    private static Object[] getValidNumberForConstructor() {
        return new Object[] {
                "3, 3", "5, 5", "10, 10"
        };
    }
    
    @SuppressWarnings("unused")
    private static Object[] getInvalidNumberForConstructor() {
        return new Object[] {
                -10, -1
        };
    }

    @Test
    @Parameters( method = "getValidNumberForConstructor" )
    public void constructorShouldSetGamesWon( int expected, int actual ) {
        FootballTeam team = new FootballTeam( actual );
        assertEquals( "\n", expected, team.getGamesWon() );
    }
    
    @Test( expected = IllegalArgumentException.class )
    @Parameters( method = "getInvalidNumberForConstructor" )
    public void constructorShouldThrowExceptionForIllegalGamesNumber(int illegalNumber) {
        new FootballTeam( illegalNumber );
    }
    
    @Test
    public void shouldBepossibleToCompareTeams() {
        FootballTeam team = new FootballTeam( ANY_NUMBER );
        assertTrue( "FootballTeam should implement Comparable", team instanceof Comparable<?> );
    }
    
    @Test
    public void teamsWithMoreMatchesWonShouldBeGreater() {
        FootballTeam team_2 = new FootballTeam( 2 );
        FootballTeam team_3 = new FootballTeam( 3 );
        assertTrue( "team with 3 games won should be ranked before the team with 2 games won", team_3.compareTo( team_2 ) > 0 );
    }
    
    @Test
    public void teamWithLessMatchesWonShouldBeLesser() {
        FootballTeam team_2 = new FootballTeam( 2 );
        FootballTeam team_3 = new FootballTeam( 3 );
        assertTrue( "team with " + team_2.getGamesWon() + " games won should be ranked after the team with " + team_3.getGamesWon() + " games won", team_2.compareTo( team_3 ) < 0 );
    }
    
    @Test
    public void teamsWithSameNumberOfMatchesWonShouldBeEqual() {
        FootballTeam teamA = new FootballTeam( ANY_NUMBER );
        FootballTeam teamB = new FootballTeam( ANY_NUMBER );
        assertTrue( "both teams have the same number of games", teamA.compareTo( teamB ) == 0 );
    }

}
