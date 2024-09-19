import java.io.*;
import java.net.*;

public class MyClient0 {
    public static void main(String[] args) {
        Socket s=null;
        DataOutputStream dos=null;

        try
        {
            s=new Socket("localhost",6666);
            System.out.println("connected to server");
            dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello Server.....");
            dos.flush();
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
                if(s!=null) s.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
