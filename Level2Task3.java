
import java.io.*;

import java.util.*;
public class Level2Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Encryption or Decryption (e/d) : ");
        char o=sc.next().charAt(0);
        System.out.println("Enter source file name : ");
       
        String source = sc.next();
        System.out.println("Enter destination file name : ");
        String dest=sc.next();
        try {
            BufferedReader r=new BufferedReader(new FileReader(source));
            BufferedWriter w=new BufferedWriter(new FileWriter(dest));
            int c;
            int key=3;
            if(o=='e'){
                while((c=r.read())!=-1){
                    char encrypt = (char) (c+key);
                    w.write(encrypt);
                }
            }
            else{
                while((c=r.read())!=-1){
                    char decrypt = (char) (c-key);
                    w.write(decrypt);
                }
                
            }
            r.close();
            w.close();
            if(o=='e'){
            System.out.println("File Encrypted and saved Succesfully to "+dest);}
            else{
                System.out.println("File Decrypted and saved Succesfully to "+dest); 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

