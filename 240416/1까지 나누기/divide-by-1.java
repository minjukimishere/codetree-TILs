import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;        
        int cnt=0;
        while((n/i)>=1){
        n/=(int)i;
        cnt++;
        i++;
        }System.out.print(cnt+1);
    }
}

//