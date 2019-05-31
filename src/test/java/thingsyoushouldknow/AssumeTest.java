package thingsyoushouldknow;

import org.junit.Test;

import static org.junit.Assume.assumeTrue;

public class AssumeTest {
    
    @Test
    public void shouldRunOnlyOnWindows() {
        assumeTrue( thisIsAWindowsMachine() );
        System.out.println( "running on Windows!" );
    }
    
    @Test
    public void shouldRunOnlyOnMac() {
        assumeTrue( thisIsAMacMachine() );
        System.out.println( "running on Mac!" );
    }
    

    @Test
    public void shouldRunOnlyOnLinux() {
        assumeTrue( thisIsALinuxMachine() );
        System.out.println( "running on Linux!" );
    }

    private boolean thisIsALinuxMachine() {
        return System.getProperty( "os.name" ).startsWith( "Linux" );
    }

    private boolean thisIsAWindowsMachine() {
        return System.getProperty( "os.name" ).startsWith( "Windows" );
    }

    private boolean thisIsAMacMachine() {
        return System.getProperty( "os.name" ).startsWith( "Mac" );
    }
    
}
