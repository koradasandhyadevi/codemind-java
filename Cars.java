import java.util.*;
public class Cars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = sc.nextInt();
        if(n2 < n1){
            System.out.print(-1);
        }
        else{
            int a = n1;
            n1 = x + a;
            int c = 1;
            while(n2 <= n1){
                n1+=a;
                n2+=n2;
                c+=1;
            }
            System.out.print(c);
        }
    }
}