import java.util.*;
public class TempTask1{
    public static int Convertor(int temp, char c){
        int ans=0;
        switch(c){
            case 'c':{
                ans=temp*9/5+32;
                break;
            }
            case 'f':{
                ans=(temp-32)*5/9;
                break;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature value:");
        int temp=sc.nextInt();
        System.out.println("Enter unit:");
    
        char c=sc.next().charAt(0);
       
        int ans=Convertor(temp, c);
        if(c=='f') System.out.println("Converted temperature "+ans+ " C");
        else System.out.println("Converted temperature "+ans+ " F");
        sc.close();
    }
}