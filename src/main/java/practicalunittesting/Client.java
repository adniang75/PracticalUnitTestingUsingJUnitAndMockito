package practicalunittesting;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private List<Address> addresses;

    public Client( List<Address> addresses ) {
        super();
        this.addresses = addresses;
    }

    public Client() {
        super();
        this.addresses = new ArrayList<>();
    }

    public void addAddress( Address address ) {
        this.addresses.add( address );
    }
    
    public List<Address> getAddresses() {
        return this.addresses;
    }

}
