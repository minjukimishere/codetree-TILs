import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        char y1 =sc.next().charAt(0);
        int a1=sc.nextInt();
        char y2 =sc.next().charAt(0);
        int a2=sc.nextInt();
        char y3 =sc.next().charAt(0);
        int a3=sc.nextInt();
        if((y1=='Y'&&a1>=37)&&(y2=='Y'&&a2>=37)){
            System.out.print('E');
        }else if((y2=='Y'&&a2>=37)&&(y3=='Y'&&a3>=37)){
            System.out.print('E');
        }else if((y1=='Y'&&a1>=37)&&(y3=='Y'&&a3>=37)){
            System.out.print('E');
        }else{
            System.out.print('N');
        }
    }
}