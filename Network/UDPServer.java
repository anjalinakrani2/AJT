
import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket ds=null;
        try
        {
            ds=new DatagramSocket(5001);
            byte[] receiveData=new byte[1024];
            System.out.println("server is open.....");

            DatagramPacket receive;
                receive=new DatagramPacket(receiveData, receiveData.length);
                ds.receive(receive);
                String clientMessage=new String(receive.getData(),0,receive.getLength());
                System.out.println("Received message from client :"+ clientMessage);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(ds!=null) ds.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
