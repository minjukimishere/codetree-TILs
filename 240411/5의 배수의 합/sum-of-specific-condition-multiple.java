import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a= sc.nextInt();
        int b=sc.nextInt();
        if(a<b){
            for(int i=a;i<=b;i++){
                if(i%5==0){
                    sum+=i;
                }
            }
        }else if(a>b){
            for(int j=b;j<=a;j++){
                if(j%5==0){
                    sum+=j;
                }
            }
        }System.out.print(sum);        
    }
}