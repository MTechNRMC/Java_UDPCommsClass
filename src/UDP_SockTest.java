import java.net.DatagramPacket;


public class UDP_SockTest extends UDP_Sock
{
	public UDP_SockTest(int port) {
		super(port);
	}
	public UDP_SockTest(int port, int timeout) {
		super(port, timeout);
	}

	@Override
	public void handler(DatagramPacket pckt) {
        System.out.println(pckt.getAddress().getHostAddress() + ": " + new String(pckt.getData()));
    }
}
