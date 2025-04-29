import java.util.*;
public class Level1Task3 {
    public static int calculateTotal(char[] grades) {
        int point = 0;
        for(char g : grades) {
            switch(g) {
                case 'a': point+=10; break;
                case 'b': point+=9; break;
                case 'c': point+=8; break;
                case 'd': point+=7; break;
                case 'e': point+=6; break;
                case 'f': point+=0; break;
            }
        }
        return point;
    }
    public static int calculateAverage(char[] grades) {
        int tot = calculateTotal(grades);
        return tot/grades.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
		char arr[]=new char [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        int point=calculateTotal(arr);
        int avg =calculateAverage(arr);
        
		System.out.println("Total Mark : "+point +"/"+(n*10));
		
		System.out.println("Average : "+avg+"/"+10);
        sc.close();
    }
}
