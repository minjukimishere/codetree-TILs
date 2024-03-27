import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        for(int b=sc.nextInt(),a=sc.nextInt();b>=a;b-=2){
            System.out.print(b+" ");
        }
    }
}