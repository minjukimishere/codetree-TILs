import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cnt=0;
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2==0||i%3==0||i%5==0){
                continue;
            }
            cnt++;
        }System.out.print(cnt);
    }
}