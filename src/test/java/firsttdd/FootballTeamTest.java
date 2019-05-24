package firsttdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FootballTeamTest {
    
    private static final int THREE_GAMES_WON = 3;

    @Test
    public void constructorShouldSetGamesWon() {
        FootballTeam team = new FootballTeam( THREE_GAMES_WON );
        assertEquals( "\n", THREE_GAMES_WON, team.getGamesWon() );
    }

}
