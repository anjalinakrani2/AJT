import java.io.*;
import java.net.*;


public class MyClient {
    public static void main(String[] args) {
        Socket s=null;
        DataInputStream dis=null;
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;

        try
        {
            s=new Socket("localhost",5000);
            System.out.println("Connected to server.");

            //receive file from server
            dis=new DataInputStream(s.getInputStream());
            String Filename="received_"+dis.readUTF();
            long FileSize=dis.readLong();
            byte[] fileBytes=new byte[(int)FileSize];

            dis.readFully(fileBytes,0,fileBytes.length);

            fos=new FileOutputStream(Filename);
            bos=new BufferedOutputStream(fos);
            bos.write(fileBytes,0,fileBytes.length);
            System.out.println("file received and saved as : "+Filename);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(bos!=null) bos.close();
                if(fos!=null) fos.close();
                if(dis!=null) dis.close();
                if(s!=null) s.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }    
}
