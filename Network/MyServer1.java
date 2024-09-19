import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String args[])
    {
        ServerSocket ss=null;
        Socket s=null;
        FileInputStream fis=null;
        BufferedInputStream bis=null;
        DataOutputStream dos=null;

        try
        {
            ss=new ServerSocket(5000);
            System.out.println("server is waiting for connection.....");

            s=ss.accept();
            System.out.println("Server connected.");

            //file to send
            File f=new File("book.java");
            byte[] filebytes=new byte[(int)f.length()];

            fis=new FileInputStream(f);
            bis=new BufferedInputStream(fis);
            bis.read(filebytes,0,filebytes.length);

            dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF(f.getName());
            dos.writeLong(filebytes.length);
            dos.write(filebytes,0,filebytes.length);
            dos.flush();
            System.out.println("file sent to client");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(dos!=null) dos.close();
                if(bis!=null) bis.close();
                if(fis!=null) fis.close();
                if(s!=null) s.close();
                if(ss!=null) ss.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
