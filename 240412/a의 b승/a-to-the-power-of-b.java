import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int mul=1;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<b;i++){
            mul*=a;
        }
        System.out.print(mul);
    }
}

//a를 b번 곱한 값 출력