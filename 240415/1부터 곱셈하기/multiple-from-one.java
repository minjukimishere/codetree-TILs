import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int prod=1;
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1; i<=10; i++){
            prod*=i;
            if(prod>=n){
                break;
                
            }
        }System.out.print(i);
    }
}