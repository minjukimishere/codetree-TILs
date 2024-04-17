import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        while(true){
            int x=sc.nextInt();
            int y=sc.nextInt();
            char ch=sc.next().charAt(0);
            System.out.print((x*y)+"\n");

            if(ch=='C'){
                break;
            }
        }
    }
}