import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int sex=sc.nextInt();
        int age=sc.nextInt();
        if(sex==1){
            if(age>=19){
                System.out.print("WOMAN");
            }else{
                System.out.print("GIRL");
            }
        }else if(sex==0){
            if(age>=19){
                System.out.print("MAN");
            }else{
                System.out.print("BOY");
            }
        }
    }
}