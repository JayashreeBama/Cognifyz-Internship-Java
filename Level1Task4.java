import java.util.*;
public class Level1Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int l=sc.nextInt();
        sc.nextLine();
        System.out.print("Include lowercase letters? (y/n): ");
        String lc = sc.nextLine();
        System.out.print("Include uppercase letters? (y/n): ");
        String uc = sc.nextLine();
        System.out.print("Include numbers? (y/n): ");
        String num = sc.nextLine();
        System.out.print("Include special characters? (y/n): ");
        String sp = sc.nextLine();
        String pool = "";
        if(lc.equalsIgnoreCase("y")){
            pool+="abcdefghijklmnopqrstuvwxyz";
        }
        if (uc.equalsIgnoreCase("y")) {
            pool += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (num.equalsIgnoreCase("y")) {
            pool += "0123456789";
        }
        if (sp.equalsIgnoreCase("y")) {
            pool += "!@#$%^&*";
        }
        Random rand=new Random();
        if (pool.length() == 0) {
            System.out.println("You must select at least one character type!");
            return;
        }
        String pwd="";
        for(int i=0;i<l;i++){
            int randindex = rand.nextInt(pool.length()); //generates random number within pool length
            pwd+=pool.charAt(randindex);
        }
        System.out.println("Your Password : "+pwd);
    }
}
