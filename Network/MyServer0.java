import java.net.*;
import java.io.*;

public class MyServer0 {
    public static void main(String[] args) {
        ServerSocket ss=null;
        Socket s=null;
        DataInputStream dis=null;
        try
        {
            ss=new ServerSocket(6666);
            System.out.println("Server is waiting for connection.......");
            s=ss.accept();
            System.out.println("Server connected.....");
            dis=new DataInputStream(s.getInputStream());
            String str=(String)dis.readUTF();
            System.out.println("message : "+str);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(dis!=null) dis.close();
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
