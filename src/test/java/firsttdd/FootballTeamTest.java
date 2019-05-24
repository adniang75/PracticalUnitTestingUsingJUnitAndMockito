package firsttdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith( JUnitParamsRunner.class )
public class FootballTeamTest {

    @SuppressWarnings( "unused" )
    private static Object[] getValueForConstructor() {
        return new Object[] {
                "3, 3", "5, 5", "10, 10"
        };
    }

    @Test
    @Parameters( method = "getValueForConstructor" )
    public void constructorShouldSetGamesWon( int expected, int actual ) {
        FootballTeam team = new FootballTeam( actual );
        assertEquals( "\n", expected, team.getGamesWon() );
    }

}
