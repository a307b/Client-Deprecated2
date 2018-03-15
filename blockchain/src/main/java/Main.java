import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        OSCheck.updateIPFS();
        IpfsCore ipfsCore = new IpfsCore();
        ipfsCore.connect();
    }
}
