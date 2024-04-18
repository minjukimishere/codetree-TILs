import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=2;
        int cnt=1;

        while(true){
            j*=2;
            cnt++;
            if(j==n){
                break;
            }
        }
        System.out.print(cnt);

        //n=2*2*2*2*2*2* x개
    }
}