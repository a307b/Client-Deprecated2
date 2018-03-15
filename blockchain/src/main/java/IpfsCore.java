import io.ipfs.api.IPFS;
import java.io.IOException;

public class IpfsCore
{
    protected void connect() throws IOException
    {
            IPFS ipfs = new IPFS("/ip4/127.0.0.1/tcp/5001");
            ipfs.refs.local();
            System.out.println("Connected to the network");
    }



}
