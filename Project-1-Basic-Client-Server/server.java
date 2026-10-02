import java.net.ServerSocket;
import java.net.Socket;

public class server
{
    public static void main(String[] args)
    {
        try
        {
        System.out.println("Waiting for client....");
        ServerSocket ss = new ServerSocket(9806);
        Socket ssc = ss.accept();
        System.out.println("Connection Establishes!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}