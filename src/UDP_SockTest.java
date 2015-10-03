import java.net.InetAddress;


public class UDP_SockTest implements HandableObject
{
	public UDP_SockTest() 
	{}

	@Override
	public void handler(InetAddress addr, byte[] msg) 
	{
        System.out.println(addr.getHostAddress() + ": " + new String(msg));
    }
}
