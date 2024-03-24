import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        sc.useDelimiter("-");
        String zero=sc.next();
        String xxxx=sc.next();
        String yyyy=sc.next();
        String temp;
        temp=xxxx;
        xxxx=yyyy;
        yyyy=temp;
        System.out.printf("%s-%s-%s",zero,xxxx,yyyy);
    }
}