import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(80<=n){
        System.out.println("pass");
        }else{
            System.out.println((n-80)+" more score");
        }

    }
}