import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            if(m%2==1&&m%3==0){
                sum+=m;
            }
        }
        System.out.print(sum);
    }
}