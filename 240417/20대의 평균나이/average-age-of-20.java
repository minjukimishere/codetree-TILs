import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int cnt=0;
        while(true){
            int age=sc.nextInt();
            if(age>29||age<20){
                System.out.printf("%.2f",((double)sum/cnt));
                break;
            }
            
            sum+=age;
            cnt++;
        }
    }
}