import java.util.Scanner;
public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("%.4f",(a+b)/2);
    }
}