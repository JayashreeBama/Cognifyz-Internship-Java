import java.util.*;
public class Level2Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String s=sc.next();
        int up=0,lp=0,sp=0,len=s.length(),num=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    up++;
                }
                else{
                    lp++;
                }
            }
            if(Character.isDigit(c)){
                num++;
            }
            if(Character.isLetterOrDigit(c)){
                sp++;
            }
        }
        int per=0;
        if(len<5 || sp<3 || up<4 || lp<4 || num<4){
            System.out.println("Your password is so weak");
        }
        else{
            System.out.println("Your password is Strong");
        }
    }
}
