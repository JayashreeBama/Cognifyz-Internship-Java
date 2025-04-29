import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss =new ServerSocket(12501);
        Socket s =ss.accept();
        DataInputStream dis= new DataInputStream(s.getInputStream());
        DataInputStream d = new DataInputStream(System.in);
        PrintStream ps = new PrintStream(s.getOutputStream());
        String s1="",s2="";
        while(!s1.equals("stop")&& !s2.equals("stop")){
            s1=dis.readLine();
            System.out.println("\nJayashree : "+s1);
            System.out.println("you : ");
            s2=d.readLine();
            ps.println(s2);


        }
        ss.close();
        s.close();
    }
}
