import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<=n; i++){
            if((i%2==0)||((i%5==0)&&(i%10!=0))||((i%3==0)&&(i%9!=0))){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}

//1의 자리가 5인 경우는 5의 배수이나 10의 배수는 아닌 경우 아닐까