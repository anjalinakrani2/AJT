//import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        DatagramSocket ds=null;
        DatagramPacket dp=null;
        try
        {
            ds=new DatagramSocket();
            String data="Hello Server !!!!";
            byte[] sendData=data.getBytes();
            
            InetAddress serverAddress=InetAddress.getByName("192.168.116.200");
            int serverPort=5001;


            dp=new DatagramPacket(sendData,sendData.length,serverAddress, serverPort);
            ds.send(dp);
            System.out.println("Data sent successfully.");
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
