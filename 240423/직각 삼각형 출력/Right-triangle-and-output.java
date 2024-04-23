import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            //1이면 1 (2n-1)
            //2이면 3 (2n-1)
            //3이면 5 (2n-1)
            System.out.println();
        }
    }
}