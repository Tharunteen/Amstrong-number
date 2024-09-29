import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int temp=num;
        int ans=0;
        while(num>0) {
            int r = num % 10;
            ans += Math.pow(r, 3);
            num = num / 10;
        }
        if(ans==temp) System.out.println("Amstrong Number");
        else System.out.println("Not A Amstrong Number");
    }
}