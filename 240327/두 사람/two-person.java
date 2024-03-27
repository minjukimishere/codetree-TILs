import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int ma=sc.nextInt();
        char m=sc.next().charAt(0);
        int wa=sc.nextInt();
        char w=sc.next().charAt(0);
        if((ma>=19||wa>=19)&&m=='M'){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}