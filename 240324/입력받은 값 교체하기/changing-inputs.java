import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.print(a+" "+b);
    }
}