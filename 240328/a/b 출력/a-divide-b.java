import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c; //몫
        if(a>=b){
            c=a/b;
            System.out.print(c+".");
            for(int i=0;i<20;i++){
                System.out.print(((a%b)*10)/b);
            }
        }else{
            System.out.print(0+".");
            for(int i=0;i<20;i++){
                System.out.print(((a%b)*10)/b);
            }
        }
    }
}

//14/3=4...2
//20/3=6...2
//20/3=6....2