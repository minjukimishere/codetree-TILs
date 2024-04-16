import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        int m;
        for(int i=1; i<=n; i++){
            m=n/i;
            cnt++;
            if(m<1){
                cnt++;
                break;
            }
        }System.out.print(cnt);

    }
}