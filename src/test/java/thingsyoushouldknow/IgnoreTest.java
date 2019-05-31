package thingsyoushouldknow;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest {

    @Test
    public void shouldBeRun() {
        System.out.println( "shouldBeRun() is running!" );
    }

    @Ignore
    @Test
    public void shouldBeIgnored() {
        System.out.println( "Huh, not ignored?!" );
    }

}
