import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        double a,b;
        char c=sc.next().charAt(0);
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.printf("%c\n%.2f\n%.2f",c,a,b);
    }
}