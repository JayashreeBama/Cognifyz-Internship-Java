import java.util.*;
public class PallindromeT2{
    public static boolean pallindrome(String s){
        String s1="",s2="";
        for(int i=0;i<s.length();i++){
             if((s.charAt(i)>='a' && s.charAt(i)<='z' ) || (s.charAt(i)>='A' && s.charAt(i)<='Z' )){
        s1+=s.charAt(i);
        }
        }
   for(int i=s1.length()-1;i>=0;i--){
    s2+=s1.charAt(i);
   }
   if(s1.equals(s2)) return true;
   return false;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String s=sc.nextLine();
 
   
   if(pallindrome(s)){
    System.out.println("Its a pallindrome");
   }
   else{
    System.out.println("Its not a pallindrome");
   }
   sc.close();
    }
}