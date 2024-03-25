import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int cm=sc.nextInt();
        int kg=sc.nextInt();
        double bmi=kg/((cm*0.01)*(cm*0.01));
        System.out.println((int)bmi);
        if(bmi>=25){
            System.out.print("Obesity");
        }
    }
}