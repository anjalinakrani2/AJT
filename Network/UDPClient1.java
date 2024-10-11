import java.io.*;
import java.net.*;

public class UDPClient1 {
    public static void main(String[] args) {
        DatagramSocket ds=null;
        FileInputStream fis=null;
        try
        {
            ds=new DatagramSocket();
            fis=new FileInputStream("Book.java");
            byte[] buffer=new byte[1024];
            
            int c;
            while((c=fis.read(buffer))!=-1)
            {
                DatagramPacket dp=new DatagramPacket(buffer, c,InetAddress.getByName("localhost"),8080);
                ds.send(dp);
            }
            System.out.println("File sent successfully.");
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
                if(fis!=null) fis.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
