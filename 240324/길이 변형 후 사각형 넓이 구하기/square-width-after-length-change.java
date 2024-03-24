import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        x+=8;
        y*=3;
        System.out.print(x+"\n"+y+"\n"+x*y);

    }
}