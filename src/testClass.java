import java.util.Scanner;

public class testClass 
{
	public static void main(String[] args)
	{
		String line = "";
		Scanner scnr = new Scanner(System.in);
		UDP_Sock sckt = new UDP_Sock(1000);
		
		sckt.startReceive(new UDP_SockTest());
		
		System.out.println("Bound to port 1000");
		while(true)
		{
			line = scnr.nextLine();
			if(line.isEmpty())
				break;
			
			// send a msg to the host and broadcast an address
			sckt.send(("Broadcast: " + line).getBytes());
			sckt.send(line.getBytes(), "localhost");
		}
		
		sckt.stopReceive();
		scnr.close();
	}
}