import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int i;
        for(i=1; i<=n; i++){
            m=m/(int)i;
            if((int)m==1){
                break;
            }    
        }System.out.print(i);
    }
}