package firsttdd;

public class FootballTeam implements Comparable<FootballTeam> {
    
    private int gamesWon;
    
    public FootballTeam( int gamesWon ) {
        super();
        if ( gamesWon < 0 ) {
            throw new IllegalArgumentException("Number of games won must be 0 or more");
        }
        this.gamesWon = gamesWon;
    }
    
    public int getGamesWon() {
        return gamesWon;
    }

    @Override
    public int compareTo( FootballTeam otherTeam ) {
        return this.gamesWon - otherTeam.getGamesWon();
    }

}
