import java.io.*;
import java.net.*;

public class UDPServer1 {
    public static void main(String[] args) {
        DatagramSocket ds=null;
        FileOutputStream fos=null;
        try
        {
            ds=new DatagramSocket(8080);
            System.out.println("server is open......");
            fos=new FileOutputStream("receiced_file");
            byte[] buffer=new byte[1024];

            DatagramPacket dp=new DatagramPacket(buffer, buffer.length);
            ds.receive(dp);

            System.out.println("file received successfully.");

            fos.write(dp.getData(),0,dp.getLength());

            System.out.println("File saved.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(fos!=null) fos.close();
                if(ds!=null) ds.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
