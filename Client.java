import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        
        Socket s =new Socket("LocalHost",12501);
        DataInputStream dis= new DataInputStream(s.getInputStream());
        DataInputStream d = new DataInputStream(System.in);
        PrintStream ps = new PrintStream(s.getOutputStream());
        String s1="",s2="";
        while(!s1.equals("stop")&& !s2.equals("stop")){
            
            
            System.out.println("\nyou : ");
            s1=d.readLine();
            ps.println(s1);
            s2=dis.readLine();
            System.out.println("Monika : "+s2);

        }
        
        s.close();
    }
}
