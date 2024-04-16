import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==1){
                System.out.print("John\n");
            }else if(n==2){
                System.out.print("Tom\n");
            }else if(n==3){
                System.out.print("Paul\n");
            }else if(n==4){
                System.out.print("Sam\n");
            }else{
                System.out.print("Vacancy\n");
                break;
            }
        }
    }
}