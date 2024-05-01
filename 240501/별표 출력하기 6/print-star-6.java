import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=2*n-(2*i-1);j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){  //1 2 3 (n=4)
            for(int j=n-1;j>i;j--){ // 3 1 0
                System.out.print("  ");
            }
            for(int j=1;j<=2*i+1;j++){ // 3 5 7
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}