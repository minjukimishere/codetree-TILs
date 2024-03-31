import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //1부터 n 까지 출력하기
        for(int i=1;i<=n;i++){
            if(i%2==0||i%3==0){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
        }
    
    
    //2의 배수or 3의 배수이면 1
    //아니면 0
    }
}